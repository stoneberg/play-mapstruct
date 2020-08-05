package com.stone.mapstruct.play.case1.payload;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EngineDto {
    private String horsePower;
    private String fuel;
}
