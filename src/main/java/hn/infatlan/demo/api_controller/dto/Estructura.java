package hn.infatlan.demo.api_controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Estructura {
    private String mensaje;
    private String variableEntorno1;
    private String variableEntorno2;
    private String variableEntorno3;
    private InformacionAdicional informacionAdicional;
}
