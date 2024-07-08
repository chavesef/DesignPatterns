package com.sippar.pattern.structural.decorator;

public abstract class Special extends IceCream{
    private final IceCream iceCream;

    @Override
    public double price(){
        return iceCream.price();
    }

    public Special (IceCream iceCream){
        this.iceCream = iceCream;
    }

    public IceCream getIceCream() {
        return iceCream;
    }
}
