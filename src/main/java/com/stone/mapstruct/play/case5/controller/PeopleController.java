package com.stone.mapstruct.play.case5.controller;

import com.stone.mapstruct.play.case5.payload.PeopleDto;
import com.stone.mapstruct.play.case5.service.PeopleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/peoples")
@RestController
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping
    public ResponseEntity<?> getPeople(){
        return new ResponseEntity<>(peopleService.getPeople(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savePoeple(@RequestBody PeopleDto peopleDto) {
        log.info("savePoeple==============>{}", peopleDto);
        return new ResponseEntity<>(peopleService.save(peopleDto), HttpStatus.CREATED);
    }
}
