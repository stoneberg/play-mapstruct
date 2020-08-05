package com.stone.mapstruct.play.case5.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@EqualsAndHashCode(of = {"id", "name"})
@Getter
@Setter // 맵핑 시 setter 없으면 에러 발생함
@NoArgsConstructor // (access = AccessLevel.PROTECTED) 맵핑 시 접근 제어할 경우 에러 발생
@AllArgsConstructor
@Entity
@Table(name = "people")
public class People {

    /**
     * 유저의 아이디 (PK)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 유저의 이름
     */
    private String name;

    /**
     * 유저의 나이
     */
    private Integer age;

    @Builder
    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
