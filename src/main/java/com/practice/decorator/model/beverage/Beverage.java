package com.practice.decorator.model.beverage;

import com.practice.decorator.model.Size;

public abstract class Beverage {

    String description;
    Size size = Size.TALL;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
}
