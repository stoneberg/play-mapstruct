package com.stone.mapstruct.play.common.mapper;

public interface EntityMapper<D, E> {

    E toEntity(D dto);

    D toDto(E entity);

}
