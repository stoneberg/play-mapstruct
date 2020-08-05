package com.stone.mapstruct.play.case5.repository;

import com.stone.mapstruct.play.case5.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
