package com.sippar.pattern.creational.singleton;

public class Counter {
    private static Counter instance;
    private int number;

    private Counter() {}
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void increment() {
        this.number++;
    }
}
