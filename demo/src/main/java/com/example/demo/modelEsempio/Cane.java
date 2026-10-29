package com.example.demo.modelEsempio;

import com.example.demo.model.Marca;

public class Cane implements Dispositivo, Dispositivo2 {
    private String razza;
    private Marca marca;
    private Integer eta;

    @Override
    public void caricaBatteria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'caricaBatteria'");
    }

    @Override
    public void accendi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accendi'");
    }

    @Override
    public void spegni() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'spegni'");
    }

    @Override
    public void reset() {
        System.out.println("Resetting the device");
    }



    /*public Cane(String nome, int eta, String razza) {
        super(nome, eta);
        this.razza = razza;
    }

    @Override 
    public void mangia() {
        System.out.println(getNome() + " sta mangiando crocchette.");
    }*/
    

    
}




