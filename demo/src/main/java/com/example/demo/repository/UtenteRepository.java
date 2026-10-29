package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UtenteDto;
import com.example.demo.model.Utente;

@Repository 
public interface UtenteRepository
 extends JpaRepository<Utente, Long> {
  
public Utente findByNome(String nome);
  public Utente save(Utente utente);
}