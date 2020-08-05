package com.stone.mapstruct.play.case1.payload;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDto {
    private String name;
    private int age;
    private List<KeyDto> keys;
}
