package com.jgarwol.dddreference.application.queryservices;

import com.jgarwol.dddreference.domain.car.CarRepository;
import com.jgarwol.dddreference.domain.car.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CarQueryService {

    CarRepository repository;

    public List<Model> getAllCarModels() {
        return repository.getAllModels();
    }
}
