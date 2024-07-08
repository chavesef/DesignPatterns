package com.sippar.pattern.structural.decorator;

public class Mix extends Special{
    private String additional;

    public Mix(IceCream iceCream) {
        super(iceCream);
    }

    public double price(){
        double t = super.price() + getCost();
        return t*1.5;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
