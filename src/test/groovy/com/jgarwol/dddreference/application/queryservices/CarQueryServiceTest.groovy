package com.jgarwol.dddreference.application.queryservices

import com.jgarwol.dddreference.domain.car.CarRepository
import com.jgarwol.dddreference.domain.car.Make
import com.jgarwol.dddreference.domain.car.Model
import spock.lang.Specification

class CarQueryServiceTest extends Specification {

    def carRepository = Mock(CarRepository)
    def carService = new CarQueryService(carRepository)

    def "should return models from repository"() {
        def expectedModels = [
                Model.of(Make.of("make1"), "model1"),
                Model.of(Make.of("make1"), "model2"),
                Model.of(Make.of("make2"), "model3"),
                Model.of(Make.of("make2"), "model4"),
        ]

        when:
        def models = carService.getAllCarModels()

        then:
        1 * carRepository.getAllModels() >> expectedModels
        models == expectedModels
    }
}
