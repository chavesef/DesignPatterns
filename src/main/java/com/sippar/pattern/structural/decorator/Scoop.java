package com.sippar.pattern.structural.decorator;

public class Scoop extends IceCream {
    private String flavor;

    @Override
    public double price() {
        return getCost()*1.2;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
