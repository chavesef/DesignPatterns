package com.sippar.pattern.structural.facade;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.registerBook("Admirável Mundo Novo",
                "Aldous Huxley", "Biblioteca Azul");
        facade.registerBook("1984", "George Orwell",
                "Companhia das Letras");
        facade.registerBook("Fahrenheit 451", "Ray Bradbury",
                "Biblioteca Azul");
        facade.registerClient("Elias Chaves",
                "efchaves@uolinc.com");
        facade.registerClient("Bernard Marx", "bmax@huxley.com");
        facade.registerClient("Winston Smith", "wsmith@orwell.com");

        System.out.println(facade.getBooks());
        System.out.println(facade.getClients());

        facade.rentBook("Fahrenheit 451", "Ray Bradbury", 3);
        System.out.println(facade.getBookMap());
    }
}
