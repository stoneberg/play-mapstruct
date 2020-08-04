package com.stone.mapstruct.play.case2.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
public class OrderDto {
    private final String name;
    private final String product;
    private final Integer price;
    private final String address;
    private final String img;
    private final LocalDateTime orderedTime;
}
