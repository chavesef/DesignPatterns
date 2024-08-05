package com.sippar.pattern.creational.factory;

public class CafeFactory {
    public static Cafe createCafe(String cor, String tipo, String descricao, String marca, String regiao,
                                  boolean capsula, boolean adocado, boolean comLeite, boolean internacional,
                                  int graos, double tamanho, String especie) {
        Cafe cafe2 = new Cafe();
        cafe2.setCor(cor);
        cafe2.setCapsula(capsula);
        cafe2.setGraos(graos);
        cafe2.setTipo(tipo);
        cafe2.setDescricao(descricao);
        cafe2.setAdocado(adocado);
        cafe2.setComLeite(comLeite);
        cafe2.setEspecie(especie);
        cafe2.setInternacional(internacional);
        cafe2.setMarca(marca);
        cafe2.setTamanho(tamanho);
        cafe2.setRegiao(regiao);
        return cafe2;
    }
}
