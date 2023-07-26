package com.jgarwol.dddreference.interfaces.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelDto {
  MakeDto make;
  String name;
}
