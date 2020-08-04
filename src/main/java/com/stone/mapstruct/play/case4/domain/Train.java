package com.stone.mapstruct.play.case4.domain;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private String name;
    private TrainType type;
}
