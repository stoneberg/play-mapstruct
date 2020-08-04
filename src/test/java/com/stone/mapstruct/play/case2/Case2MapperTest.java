package com.stone.mapstruct.play.case2;

import com.stone.mapstruct.play.case2.domain.Order;
import com.stone.mapstruct.play.case2.mapper.OrderMapper;
import com.stone.mapstruct.play.case2.payload.OrderDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class Case2MapperTest {

    @Test
    @DisplayName("convert dto to entity test")
    void dto_to_entity_test() {
        // given
        final OrderDto orderDto = OrderDto.builder()
                .name("LSD")
                .product("Drug")
                .price(100000000)
                .address("Busan")
                .orderedTime(LocalDateTime.of(2020, 8, 15, 10, 30, 0))
                .build();

        // when
        final Order order = OrderMapper.INSTANCE.orderToEntity(orderDto);

        // then
        assertNotNull(order);
        assertThat(order.getId()).isEqualTo(0L);
        assertThat(order.getName()).isEqualTo("LSD");
        assertThat(order.getProduct()).isEqualTo("Drug");
        assertThat(order.getPrice()).isEqualTo(100000000);
        assertThat(orderDto.getOrderedTime()).isAfter(LocalDateTime.now());
        assertThat(order.getAddress()).isEqualTo("Busan");
    }

    @Test
    @DisplayName("convert entity to dto test")
    void entity_to_dto_test() {
        // given
        final Order order = Order.builder()
                .id(1L)
                .name("Magic Mushroom")
                .product("Drug")
                .price(50000000)
                .address("Incheon")
                .orderedTime(LocalDateTime.now())
                .build();

        // when
        final OrderDto orderDto = OrderMapper.INSTANCE.orderToDto(order);

        // then
        assertNotNull(orderDto);
        assertThat(orderDto.getName()).isEqualTo("Magic Mushroom");
        assertThat(orderDto.getProduct()).isEqualTo("Drug");
        assertThat(orderDto.getPrice()).isEqualTo(50000000);
        assertThat(orderDto.getAddress()).isEqualTo("Incheon");
        assertThat(orderDto.getOrderedTime()).isBefore(LocalDateTime.now());
        assertThat(orderDto.getImg()).isEqualTo("Drug.jpg");
    }

}
