package com.stone.mapstruct.play.case3.payload;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class UserDto {
    private String name;
}
