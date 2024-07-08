package com.sippar.pattern.structural.adapter;

public class App {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(10, 5);
        System.out.println(adapter.getVolume(adapter.getRadius()));
    }
}
