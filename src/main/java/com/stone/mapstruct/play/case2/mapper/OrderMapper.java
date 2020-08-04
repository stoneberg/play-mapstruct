package com.stone.mapstruct.play.case2.mapper;

import com.stone.mapstruct.play.case2.domain.Order;
import com.stone.mapstruct.play.case2.payload.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    /**
     * source(dto)에 id가 존재하지 않으나 target(entity) id필드에 상수값 0L을 주입
     */
    @Mapping(target = "id", constant = "0L")
    Order orderToEntity(OrderDto orderDto);

    /**
     * source(entity)에 img 필드가 존재하지 않으나 target(dto)의 img필드에 상품명 + .jpg를 붙여 주입
     */
    @Mapping(target = "img", expression = "java(order.getProduct() + \".jpg\")")
    OrderDto orderToDto(Order order);

}
