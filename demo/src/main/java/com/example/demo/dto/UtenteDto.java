package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

public record UtenteDto(
    String nome,
    String cognome,
    int eta
) {
}
