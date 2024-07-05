package com.sippar.pattern.creational.factory;

public class App {
    public static void main(String[] args) {
        ChocolateQuente chocolate = new ChocolateQuente();
        chocolate.setComCanela(true);
        PreparoAutomatico preparo = new PreparoAutomatico();
        preparo.setMarca("Nespresso");
        System.out.println(preparo);
        System.out.println(chocolate);
        Cafe cafe = new Cafe();
        cafe.setAdocado(false);
        PreparoManual preparo2 = new PreparoManual();
        preparo2.setNomeAtendente("Elias");
        System.out.println(preparo2);
        System.out.println(cafe);
        Bebida cafe2 = preparo2.prepararBebida();
    }
}
