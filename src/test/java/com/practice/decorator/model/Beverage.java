package com.practice.decorator.model;

public abstract class Beverage {

    String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
