package com.stone.mapstruct.play.case4.mapper;

import com.stone.mapstruct.play.case4.domain.Train;
import com.stone.mapstruct.play.case4.domain.TrainType;
import com.stone.mapstruct.play.case4.payload.TrainDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class TrainMapper {
    /**
     * success
     * @param train
     */
    @BeforeMapping
    protected void setTrainType(TrainDto trainDto, @MappingTarget Train train) {
//        if (trainDto.getName().equals("KTX")) {
//            train.setType(TrainType.KTX);
//        } else if (trainDto.getName().equals("ITX")) {
//            train.setType(TrainType.ITX);
//        }
        if (trainDto.getPrice() > 50000L) {
            train.setType(TrainType.KTX);
        } else if (trainDto.getPrice() > 30000L) {
            train.setType(TrainType.ITX);
        } else {
            train.setType(TrainType.Mugunghwa);
        }

    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget Train train) {
        train.setFeature(train.getType().toString() + " For " + train.getDestination());
    }

    public abstract Train toTrainEntity(TrainDto trainDto);

}