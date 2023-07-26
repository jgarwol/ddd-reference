package com.jgarwol.dddreference.interfaces.rest;

import com.jgarwol.dddreference.domain.car.Make;
import org.springframework.stereotype.Component;

@Component
public class MakeDtoMapper {
  public MakeDto toMakeDto(Make make) {
    return new MakeDto(make.getName());
  }
}
