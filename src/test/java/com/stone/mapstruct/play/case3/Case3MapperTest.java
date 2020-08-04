package com.stone.mapstruct.play.case3;

import com.stone.mapstruct.play.case3.domain.User;
import com.stone.mapstruct.play.case3.mapper.UserMapper;
import com.stone.mapstruct.play.case3.payload.AddressDto;
import com.stone.mapstruct.play.case3.payload.UserDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Case3MapperTest {

    private static final Logger log = LoggerFactory.getLogger(Case3MapperTest.class);

    @Test
    @DisplayName("1. convert two(user, address) dto to user entity test")
    void dto_to_entity_test() {
        // given
        final UserDto userDto = UserDto.of("stoneberg");
        final AddressDto addressDto = AddressDto.of("SungNam-Si", "TaePyeong-Dong");

        // when
        final User user = UserMapper.INSTANCE.userToEntity(userDto, addressDto);
        log.info("user==============>{}", user);

        // then
        assertNotNull(user);
        assertThat(user.getUsername()).isEqualTo(userDto.getName());
    }

}
