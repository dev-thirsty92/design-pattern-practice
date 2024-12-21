package com.practice.decorator.model;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();

}
