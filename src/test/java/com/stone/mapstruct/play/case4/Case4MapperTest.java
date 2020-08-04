package com.stone.mapstruct.play.case4;

import com.stone.mapstruct.play.case4.domain.Train;
import com.stone.mapstruct.play.case4.mapper.TrainMapper;
import com.stone.mapstruct.play.case4.payload.TrainDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Case4MapperTest {

    /**
     * Before, After 처리 테스트
     */

    private static final Logger log = LoggerFactory.getLogger(Case4MapperTest.class);

    @Test
    @DisplayName("before mapping after mapping test")
    void before_mapping_after_mapping_test() {
        // given
        final TrainDto trainDto = TrainDto.of("Busan", 45000L);

        // when
        TrainMapper mapper = Mappers.getMapper(TrainMapper.class);
        Train train = mapper.toTrainEntity(trainDto);
        log.info("train==============>{}", train);

        // then
        assertNotNull(train);
        assertThat(train.getFeature()).isEqualTo("ITX For Busan");
    }
}
