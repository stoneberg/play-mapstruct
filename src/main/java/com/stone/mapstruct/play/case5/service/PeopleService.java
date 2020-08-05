package com.stone.mapstruct.play.case5.service;

import com.stone.mapstruct.play.case5.domain.People;
import com.stone.mapstruct.play.case5.mapper.PeopleMapper;
import com.stone.mapstruct.play.case5.payload.PeopleDto;
import com.stone.mapstruct.play.case5.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;
    private final PeopleMapper peopleMapper;

    /**
     * save people
     * @param peopleDto
     */
    public Long save(PeopleDto peopleDto){
        log.info("save==============>{}", peopleDto);
        People people = peopleMapper.toEntity(peopleDto); // DTO -> Entity
        return peopleRepository.save(people).getId(); // Entity를 저장
    }

    /**
     * get people
     * @return
     */
    public List<PeopleDto> getPeople() {
        return peopleRepository.findAll().stream().map(peopleMapper::toDto).collect(Collectors.toList());
    }
}
