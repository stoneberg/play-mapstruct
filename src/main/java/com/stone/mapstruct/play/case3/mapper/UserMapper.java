package com.stone.mapstruct.play.case3.mapper;

import com.stone.mapstruct.play.case3.domain.User;
import com.stone.mapstruct.play.case3.payload.AddressDto;
import com.stone.mapstruct.play.case3.payload.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "user.name", target = "username")
    @Mapping(source = "address.si", target = "si")
    @Mapping(source = "address.dong", target = "dong")
    User userToEntity(UserDto user, AddressDto address);

}
