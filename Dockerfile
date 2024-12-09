### STG 1:IMG BUILDER
FROM alpine/java:17-jdk AS builder
WORKDIR /opt/app
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw -DskipTests clean install

### STG 2:IMG DEPLOY
FROM alpine/java:17-jre AS final
WORKDIR /opt/app
ENV TZ=America/Tegucigalpa
EXPOSE 8080
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar"]