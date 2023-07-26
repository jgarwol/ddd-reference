package com.jgarwol.dddreference.domain.car;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Make {
    String name;
    public static Make of(String name){
        return new Make(name);
    }
}
