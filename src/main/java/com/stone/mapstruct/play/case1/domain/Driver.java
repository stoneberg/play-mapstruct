package com.stone.mapstruct.play.case1.domain;

import lombok.Value;

import java.util.List;

@Value
public class Driver {
    String name;
    int age;
    List<Key> keys;
}
