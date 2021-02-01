package com.xingchaovv.spring.example.context01.constructor_injection.entity;

import lombok.ToString;

@ToString
public class Car {

    private final String name;
    private final int numOfTire;

    public Car(String name, int numOfTire) {
        this.name = name;
        this.numOfTire = numOfTire;
    }
}
