package com.jgarwol.dddreference.interfaces.rest;

import com.jgarwol.dddreference.application.queryservices.CarQueryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    CarQueryService carQueryService;
    ModelDtoMapper modelDtoMapper;
    @GetMapping("/api/models")
    public List<ModelDto> getAllCarModels(){
        return modelDtoMapper.toModelDtoList(carQueryService.getAllCarModels());
    }
}
