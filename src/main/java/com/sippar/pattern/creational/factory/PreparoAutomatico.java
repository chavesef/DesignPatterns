package com.sippar.pattern.creational.factory;

public class PreparoAutomatico extends Preparo{
    private String marca;

    @Override
    public Bebida prepararBebida() {
        return new ChocolateQuente();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
