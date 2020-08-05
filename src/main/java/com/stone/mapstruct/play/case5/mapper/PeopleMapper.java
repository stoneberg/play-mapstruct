package com.stone.mapstruct.play.case5.mapper;

import com.stone.mapstruct.play.case5.domain.People;
import com.stone.mapstruct.play.case5.payload.PeopleDto;
import com.stone.mapstruct.play.common.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleMapper {

    People toEntity(PeopleDto peopleDto);

    PeopleDto toDto(People people);

}
