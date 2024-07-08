package com.sippar.pattern.structural.decorator;

public abstract class IceCream {
    public double cost;

    public IceCream(double cost) {
        this.cost = cost;
    }

    public IceCream(){}

    public abstract double price();

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
