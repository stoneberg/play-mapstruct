package com.stone.mapstruct.play.case1.payload;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.List;

@Builder
@Getter
public class DriverDto {
    private final String name;
    private final int age;
    private final List<KeyDto> keys;
}
