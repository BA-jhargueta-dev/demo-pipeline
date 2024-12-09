package hn.infatlan.demo.api_controller.service;

import hn.infatlan.demo.api_controller.config.ConfigVariableCollection;
import hn.infatlan.demo.api_controller.dto.CampoAdicional;
import hn.infatlan.demo.api_controller.dto.Estructura;
import hn.infatlan.demo.api_controller.dto.InformacionAdicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
public class ServicioDemo implements IServicioDemo{

    @Autowired
    ConfigVariableCollection configurations;

    @Override
    public Estructura ejecutar() {
        List<CampoAdicional> info = List.of(
                CampoAdicional.builder().nombre("fecha").valor(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))).build(),
                CampoAdicional.builder().nombre("identificador").valor(UUID.randomUUID().toString()).build(),
                CampoAdicional.builder().nombre("total_llamadas").valor("1").build());
        return Estructura.builder()
                .mensaje(configurations.getMessage())
                .variableEntorno1(configurations.getOsvariable1())
                .variableEntorno2(configurations.getOsvariable2())
                .variableEntorno3(configurations.getOsvariable3())
                .informacionAdicional(InformacionAdicional.builder().CampoAdicional(info).build())
                .build();
    }
}
