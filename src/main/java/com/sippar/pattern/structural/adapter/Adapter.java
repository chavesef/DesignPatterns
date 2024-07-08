package com.sippar.pattern.structural.adapter;

public class Adapter extends Cylinder{
    private final Circle circle = new Circle();

    public Adapter(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume(double radius) {
        circle.setRadius(radius);
        return circle.getArea()*getHeight();
    }
}
