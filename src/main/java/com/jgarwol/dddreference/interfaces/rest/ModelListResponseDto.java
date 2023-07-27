package com.jgarwol.dddreference.interfaces.rest;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelListResponseDto {

  List<ModelDto> list;
}
