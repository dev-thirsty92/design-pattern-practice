package com.practice.decorator.model;

public class Decaf extends Beverage{
    public Decaf() {
        description = "decaf";
    }

    public double cost(){
        return 1.05;
    }
}
