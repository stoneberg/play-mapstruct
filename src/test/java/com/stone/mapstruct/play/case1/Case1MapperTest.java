package com.stone.mapstruct.play.case1;

import com.stone.mapstruct.play.case1.domain.*;
import com.stone.mapstruct.play.case1.mapper.CarMapper;
import com.stone.mapstruct.play.case1.payload.CarDto;
import com.stone.mapstruct.play.case1.payload.DriverDto;
import com.stone.mapstruct.play.case1.payload.KeyDto;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class Case1MapperTest {

    private static final Logger log = LoggerFactory.getLogger(Case1MapperTest.class);

    @Test
    void map() {
        Key key = new Key("12345");
        Driver driver = new Driver("Lee YuPyeong", 48, Collections.singletonList(key));
        Engine engine = new Engine(250.0, "Gasoline");

        Car car = Car.builder()
                .maker("Volvo")
                .numberOfSeats(5)
                .type(CarType.MEDIUM)
                .drivers(Collections.singletonList(driver))
                .price(30000.0)
                .manufacturingDate(LocalDate.of(2018, 12, 12))
                .engine(engine)
                .features(Arrays.asList("safe", "edge"))
                .build();

        // CarDto carDto = Mappers.getMapper(CarMapper.class).carToCarDto(car);
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        assertThat(car.getMaker()).isEqualTo(carDto.getManufacturer());
        assertThat(car.getNumberOfSeats()).isEqualTo(carDto.getNumberOfSeats());
        assertThat(car.getDrivers().size()).isEqualTo(carDto.getDrivers().size());
        log.info("carType============>{}", carDto.getType());
        log.info("price==============>{}", carDto.getPrice());
        log.info("engine.power=======>{}", carDto.getEngine().getHorsePower());
        log.info("manufacturingDate==>{}", carDto.getManufacturingDate());

        DriverDto driverDto = carDto.getDrivers().get(0);
        assertThat(driver.getAge()).isEqualTo(driverDto.getAge());
        assertThat(driver.getName()).isEqualTo(driverDto.getName());
        assertThat(driverDto.getKeys().size()).isEqualTo(1);

        KeyDto keyDto = driverDto.getKeys().get(0);
        assertThat(key.getSerialNumber()).isEqualTo(keyDto.getSerialId());
        log.info("serialId============>{}", keyDto.getSerialId());
    }
}
