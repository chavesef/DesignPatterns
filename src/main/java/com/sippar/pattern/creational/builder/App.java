package com.sippar.pattern.creational.builder;

public class App {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        Assembler assembler = new Assembler(gamer);

        Setup setup = assembler.mount();
        System.out.println(setup);

        Domestic domestic = new Domestic();
        assembler.setBuilder(domestic);

        setup = assembler.mount();
        System.out.println(setup);
    }
}
