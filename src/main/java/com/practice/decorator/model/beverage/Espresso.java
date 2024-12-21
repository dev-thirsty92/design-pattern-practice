package com.practice.decorator.model.beverage;

public class Espresso extends Beverage{

    public Espresso() {
        description = "espresso";
    }

    public double cost(){
        return 1.99;
    }
}
