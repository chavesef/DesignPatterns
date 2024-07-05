package com.sippar.pattern.creational.factory;

public class ChocolateQuente extends Bebida{
    private boolean comCanela;

    @Override
    public Bebida fazerBebida() {
        return new ChocolateQuente();
    }

    public boolean isComCanela() {
        return comCanela;
    }

    public void setComCanela(boolean comCanela) {
        this.comCanela = comCanela;
    }
}
