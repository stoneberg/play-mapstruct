package com.stone.mapstruct.play.case1.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

@Builder
@Value
public class Car {
    String maker;
    int numberOfSeats;
    CarType type;
    List<Driver> drivers;
    Double price;
    LocalDate manufacturingDate;
    Engine engine;
    List<String> features;
}
