package hn.infatlan.demo.api_controller.controller;

import hn.infatlan.demo.api_controller.dto.Estructura;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Value("${app.default.message}")
    private String message;

    @Value("${app.default.osvariable.1}")
    private String variableEntorno1;

    @Value("${app.default.osvariable.2}")
    private String variableEntorno2;

    @Value("${app.default.osvariable.3}")
    private String variableEntorno3;

    @GetMapping(value = "/message", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Estructura getMessage(){
        return Estructura.builder()
                .mensaje(message)
                .variableEntorno1(variableEntorno1)
                .variableEntorno2(variableEntorno2)
                .variableEntorno3(variableEntorno3).build();
    }
}
