package com.practice.decorator.model.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "houseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
