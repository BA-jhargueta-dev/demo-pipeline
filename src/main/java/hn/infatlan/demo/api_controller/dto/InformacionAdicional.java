package hn.infatlan.demo.api_controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InformacionAdicional {
    private List<CampoAdicional>CampoAdicional;
}
