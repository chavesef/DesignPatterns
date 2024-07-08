package com.sippar.pattern.creational.singleton;

public class App {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        counter.increment();
        Counter counter2 = Counter.getInstance();
        counter2.increment();
        counter.increment();
        System.out.println(counter.getNumber());
        System.out.println(counter2.getNumber());
        System.out.println(counter==counter2);
    }
}
