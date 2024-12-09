package hn.infatlan.demo.api_controller.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.default")
@Data
public class ConfigVariableCollection {
    private String message;
    private String osvariable1;
    private String osvariable2;
    private String osvariable3;
}
