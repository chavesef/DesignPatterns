package com.sippar.pattern.structural.decorator;

public class MilkShake extends Special{
    private double milkQuantity;

    public MilkShake(IceCream iceCream) {
        super(iceCream);
    }

    public double getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(double milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public double price(){
        double t = super.price() + getCost();
        return t*1.3;
    }
}
