package com.jgarwol.dddreference.interfaces.rest

import com.jgarwol.dddreference.domain.car.Make
import spock.lang.Specification

class MakeDtoMapperTest extends Specification {
    def mapper = new MakeDtoMapper()


    def "should convert make"() {
        def make = new Make("make name")
        expect:
        with(mapper.toMakeDto(make)) {
            name == make.name
        }
    }
}
