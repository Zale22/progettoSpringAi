package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Garbage collector

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor 
@Entity 
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String colore;
    private Marca marca;

    @ManyToOne(targetEntity = Utente.class)
    @JoinColumn(name = "utente_id")
    private Utente utente;

}
