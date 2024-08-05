package com.sippar.pattern.creational.factory;

public class App {
    public static void main(String[] args) {
       CafeFactory.createCafe("Preto", "Arabica", "Fabrica", "Expresso", "Sudeste",
               true, false, false, true, 9, 12.90, "Azul");
    }
}
