package com.practice.decorator.model.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "darkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
