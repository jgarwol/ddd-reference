package com.jgarwol.dddreference.domain.car;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Car {
  Model model;
  LocalDate productionDate;

}
