package com.jgarwol.dddreference.interfaces.rest

import com.jgarwol.dddreference.domain.car.Make
import com.jgarwol.dddreference.domain.car.Model
import spock.lang.Specification

class ModelDtoMapperTest extends Specification {

    def makeDtoMapper = Mock(MakeDtoMapper)
    def modelDtoMapper = new ModelDtoMapper(makeDtoMapper)

    def "should convert model"() {
        def model = new Model(new Make("make name"), "model name")
        def expectedMakeDto = new MakeDto("make dto name")

        when:
        def modelDto = modelDtoMapper.toModelDto(model)


        then:
        makeDtoMapper.toMakeDto(model.getMake()) >> expectedMakeDto
        with(modelDto) {
            it.make == expectedMakeDto
            it.name == model.name
        }
    }
}
