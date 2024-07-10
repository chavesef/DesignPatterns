package com.sippar.pattern.behavioral.command;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.addCommand(new TurnOn(light));
        christmasTree.addCommand(new TurnOff(light));
        christmasTree.addCommand(new TurnOn(light));
        christmasTree.addCommand(new TurnOff(light));
        christmasTree.addCommand(new TurnOn(light));
        christmasTree.addCommand(new TurnOff(light));
        christmasTree.christmasTree();
    }
}
