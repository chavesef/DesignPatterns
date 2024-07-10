package com.sippar.pattern.behavioral.command;

public class Light {
    private int intensity;

    public void turnOn(){
        System.out.println("Light is on");
    }

    public void turnOff(){
        System.out.println("Light is off");
    }
}
