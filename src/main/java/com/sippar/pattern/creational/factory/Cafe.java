package com.sippar.pattern.creational.factory;

public class Cafe extends Bebida{
    private boolean adocado;
    private String tipo;
    private double tamanho;
    private String descricao;
    private boolean internacional;
    private int graos;
    private String especie;
    private boolean comLeite;
    private boolean capsula;
    private String marca;
    private String cor;
    private String regiao;

    public Cafe() {}
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public int getGraos() {
        return graos;
    }

    public void setGraos(int graos) {
        this.graos = graos;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isComLeite() {
        return comLeite;
    }

    public void setComLeite(boolean comLeite) {
        this.comLeite = comLeite;
    }

    public boolean isCapsula() {
        return capsula;
    }

    public void setCapsula(boolean capsula) {
        this.capsula = capsula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
