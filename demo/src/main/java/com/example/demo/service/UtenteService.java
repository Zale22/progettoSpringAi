package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UtenteDto;
import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@Service 
public class UtenteService {

    private final UtenteRepository utenteRepository;

    UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public Utente getUtenteByNome(String nome) {
        return utenteRepository.findByNome(nome);
    }
    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

    public void creaUtente(UtenteDto utenteDto) {
        Utente utente = new Utente();
        utente.setNome(utenteDto.nome());
        utente.setCognome(utenteDto.cognome());
        utente.setEta(utenteDto.eta());
        utenteRepository.save(utente);
    } 
    
    public List<Utente> getUtenteMario(String string) {
        List<Utente> utenti = 
        utenteRepository.findAll(); 
        return utenti.stream()
                .filter(utente -> utente.getNome().equals(string))
                .collect(Collectors.toList());
    } 

}
