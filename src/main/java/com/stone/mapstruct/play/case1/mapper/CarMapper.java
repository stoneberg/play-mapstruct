package com.stone.mapstruct.play.case1.mapper;

import com.stone.mapstruct.play.case1.domain.Car;
import com.stone.mapstruct.play.case1.domain.Key;
import com.stone.mapstruct.play.case1.payload.CarDto;
import com.stone.mapstruct.play.case1.payload.KeyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "maker", target = "manufacturer")
    @Mapping(source = "engine.horsePower", numberFormat = "#.##E0", target = "engine.horsePower")
    @Mapping(source = "manufacturingDate", dateFormat = "yyyy.MM.dd", target = "manufacturingDate")
    // @Mapping(target = "drivers", ignore = true)
    CarDto carToCarDto(Car car);

//    @Mapping(source="serialNumber", target="serialId")
//    KeyDto keyToKeyDto(Key key);

    default KeyDto keyToKeyDto(Key key) {
        return KeyDto.builder().serialId(key.getSerialNumber()).build();
    }
}
