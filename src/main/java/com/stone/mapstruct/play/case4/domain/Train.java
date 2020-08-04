package com.stone.mapstruct.play.case4.domain;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private String destination;
    private TrainType type;
    private Long price;
    private String feature;
}
