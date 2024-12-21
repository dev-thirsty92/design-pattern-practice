package com.practice.decorator.model;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "houseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
