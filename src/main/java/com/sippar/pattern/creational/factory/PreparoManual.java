package com.sippar.pattern.creational.factory;

public class PreparoManual extends Preparo {
    private String nomeAtendente;

    @Override
    public Bebida prepararBebida() {
        return new Cafe();
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }
}
