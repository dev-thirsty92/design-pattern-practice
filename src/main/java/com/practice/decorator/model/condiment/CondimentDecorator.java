package com.practice.decorator.model.condiment;

import com.practice.decorator.model.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
