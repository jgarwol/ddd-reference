package com.jgarwol.dddreference.domain.car;

import java.util.List;

public interface CarRepository {
    List<Make> getAllMakes();
    List<Model> getAllModels();
    List<Model> getModelsByMake(Make make);

}
