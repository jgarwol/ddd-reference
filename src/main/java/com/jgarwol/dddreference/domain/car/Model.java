package com.jgarwol.dddreference.domain.car;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Model {
    Make make;
    String name;

    public static Model of(Make make, String name) {
        return new Model(make, name);
    }


}
