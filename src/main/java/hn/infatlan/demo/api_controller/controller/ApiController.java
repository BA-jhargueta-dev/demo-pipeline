package hn.infatlan.demo.api_controller.controller;

import hn.infatlan.demo.api_controller.config.ConfigVariableCollection;
import hn.infatlan.demo.api_controller.dto.CampoAdicional;
import hn.infatlan.demo.api_controller.dto.Estructura;
import hn.infatlan.demo.api_controller.service.IServicioDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private IServicioDemo servicioDemo;

    @GetMapping(value = "/message", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Estructura getMessage(){
        return servicioDemo.ejecutar();
    }
}
