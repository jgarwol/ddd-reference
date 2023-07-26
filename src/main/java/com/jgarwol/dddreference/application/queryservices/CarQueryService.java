package com.jgarwol.dddreference.application.queryservices;

import com.jgarwol.dddreference.domain.car.CarRepository;
import com.jgarwol.dddreference.domain.car.Model;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarQueryService {

  CarRepository repository;

  public List<Model> getAllCarModels() {
    return repository.getAllModels();
  }
}
