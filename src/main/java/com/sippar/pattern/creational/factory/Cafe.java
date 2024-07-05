package com.sippar.pattern.creational.factory;

public class Cafe extends Bebida{
    private boolean adocado;

    @Override
    public Bebida fazerBebida() {
        return new Cafe();
    }

    public boolean isAdocado() {
        return adocado;
    }

    public void setAdocado(boolean adocado) {
        this.adocado = adocado;
    }
}
