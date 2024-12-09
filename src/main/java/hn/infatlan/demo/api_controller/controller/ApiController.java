package hn.infatlan.demo.api_controller.controller;

import hn.infatlan.demo.api_controller.config.ConfigVariableCollection;
import hn.infatlan.demo.api_controller.dto.Estructura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ConfigVariableCollection configurations;

    @GetMapping(value = "/message", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Estructura getMessage(){
        return Estructura.builder()
                .mensaje(configurations.getMessage())
                .variableEntorno1(configurations.getOsvariable1())
                .variableEntorno2(configurations.getOsvariable2())
                .variableEntorno3(configurations.getOsvariable3())
                .build();
    }
}
