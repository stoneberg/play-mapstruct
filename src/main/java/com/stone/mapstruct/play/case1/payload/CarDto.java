package com.stone.mapstruct.play.case1.payload;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDto {
    private String manufacturer;
    private int numberOfSeats;
    private String type;
    private List<DriverDto> drivers;
    private Double price;
    private String manufacturingDate;
    private EngineDto engine;
    private List<String> features;

//    @Builder
//    public CarDto(String manufacturer, int numberOfSeats, String type, List<DriverDto> drivers, Double price, String manufacturingDate, EngineDto engine, List<String> features) {
//        this.manufacturer = manufacturer;
//        this.numberOfSeats = numberOfSeats;
//        this.type = type;
//        this.drivers = drivers;
//        this.price = price;
//        this.manufacturingDate = manufacturingDate;
//        this.engine = engine;
//        this.features = features;
//    }

}
