package com.jgarwol.dddreference.infrastructure.repositories.jpa;

import com.jgarwol.dddreference.domain.car.CarRepository;
import com.jgarwol.dddreference.domain.car.Make;
import com.jgarwol.dddreference.domain.car.Model;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarStaticRepository implements CarRepository {

    private static final Make PORSCHE = Make.of("Porsche");
    private static final Make FORD = Make.of("Ford");
    private static final Make NISSAN = Make.of("Nissan");

    @Override
    public List<Make> getAllMakes() {
        return getAllModels().stream().map(Model::getMake).distinct().toList();
    }

    @Override
    public List<Model> getAllModels() {
        return List.of(
                Model.of(NISSAN, "GT-R"),
                Model.of(NISSAN, "370Z"),
                Model.of(FORD, "Mustang"),
                Model.of(PORSCHE, "911 Turbo"),
                Model.of(PORSCHE, "Cayenne")
        );
    }

    @Override
    public List<Model> getModelsByMake(Make make) {
        return getAllModels().stream().filter(model -> make.equals(model.getMake())).toList();
    }
}
