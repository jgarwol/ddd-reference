package com.jgarwol.dddreference.interfaces.rest;

import com.jgarwol.dddreference.domain.car.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ModelDtoMapper {
    MakeDtoMapper makeDtoMapper;
    public List<ModelDto> toModelDtoList(List<Model> allCarModels) {
        return allCarModels.stream().map(this::toModelDto).toList();
    }

    public ModelDto toModelDto(Model model) {
        return new ModelDto(makeDtoMapper.toMakeDto(model.getMake()), model.getName());
    }
}
