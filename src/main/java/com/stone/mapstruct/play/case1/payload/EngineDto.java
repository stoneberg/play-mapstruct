package com.stone.mapstruct.play.case1.payload;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EngineDto {
    private final String horsePower;
    private final String fuel;
}
