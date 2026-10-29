package com.example.demo.modelEsempio;

import jakarta.validation.constraints.NotNull;

public interface Dispositivo {

    void accendi();

    void spegni();

    default void reset() {
        System.out.println("Resetting the device...");
    }

    static void aggiornaFirmware() {
        System.out.println("Aggiornamento del firmware in corso...");
    }
    
}
