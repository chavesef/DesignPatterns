package com.sippar.pattern.structural.decorator;

public class App {
    public static void main(String[] args) {
        Scoop scoop = new Scoop();
        scoop.setFlavor("Strawberry");
        scoop.setCost(5);
        System.out.println("Scoop: " + scoop.price());
        Mix mix = new Mix(scoop);
        mix.setAdditional("Hazelnut");
        mix.setCost(2);
        System.out.println("Mix: " + mix.price());
        MilkShake milkShake = new MilkShake(mix);
        milkShake.setMilkQuantity(10);
        milkShake.setCost(1);
        System.out.println("Milk Shake + Mix: " + milkShake.price());
    }
}
