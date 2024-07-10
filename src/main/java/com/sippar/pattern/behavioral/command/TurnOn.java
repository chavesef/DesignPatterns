package com.sippar.pattern.behavioral.command;

public class TurnOn implements Command {
    private final Light light;

    public TurnOn (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
