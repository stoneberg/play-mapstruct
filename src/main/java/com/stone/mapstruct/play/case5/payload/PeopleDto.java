package com.stone.mapstruct.play.case5.payload;

import lombok.*;

@Data
public class PeopleDto {

    /**
     * 유저의 아이디 (PK)
     */
    private Long id;

    /**
     * 유저의 이름
     */
    private String name;

    /**
     * 유저의 나이
     */
    private Integer age;

}
