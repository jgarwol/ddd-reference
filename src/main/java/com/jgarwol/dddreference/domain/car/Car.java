package com.jgarwol.dddreference.domain.car;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class Car {
    Model model;
    LocalDate productionDate;

}
