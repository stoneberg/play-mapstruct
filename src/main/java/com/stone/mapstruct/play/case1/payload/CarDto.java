package com.stone.mapstruct.play.case1.payload;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CarDto {
    private final String manufacturer;
    private final int numberOfSeats;
    private final String type;
    private final List<DriverDto> drivers;
    private final Double price;
    private final String manufacturingDate;
    private final EngineDto engine;
    private final List<String> features;
}
