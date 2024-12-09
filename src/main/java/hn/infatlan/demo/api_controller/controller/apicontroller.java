package hn.infatlan.demo.api_controller.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class apicontroller {
    @Value("${app.default.message}")
    private String message;

    @Value("${app.default.osvariable.1}")
    private String variableEntorno1;

    @Value("${app.default.osvariable.2}")
    private String variableEntorno2;

    @Value("${app.default.osvariable.3}")
    private String variableEntorno3;

    @GetMapping(value = "/message", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, String> getMessage(){
        return Map.of("message", message,
                "variable_entorno_1", variableEntorno1,
                "variable_entorno_2", variableEntorno2,
                "variable_entorno_3", variableEntorno3);
    }
}
