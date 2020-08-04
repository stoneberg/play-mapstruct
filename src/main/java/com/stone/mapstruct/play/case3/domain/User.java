package com.stone.mapstruct.play.case3.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@EqualsAndHashCode
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // entity는 기본 생성자가 필요
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String si;
    private String dong;
}
