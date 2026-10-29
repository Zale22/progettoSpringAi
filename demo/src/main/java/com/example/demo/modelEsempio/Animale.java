package com.example.demo.modelEsempio;

public abstract class Animale {
    String nome;
    int eta;

    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }


    public int getEta() {
        return eta;
    }

    //-------------------------------------------------------------------------
    public void mangia() {
        System.out.println(nome + " sta mangiando.");
    }

    public void dorme() {
        System.out.println(nome + " sta dormendo.");
    }
    //-------------------------------------------------------------------------

}
