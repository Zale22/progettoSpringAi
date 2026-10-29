package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UtenteDto;
import com.example.demo.model.Utente;
import com.example.demo.service.UtenteService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/utenti")
@CrossOrigin(origins = "http://localhost:4200")
public class UtenteController {
    
    private final UtenteService utenteService;

    UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @GetMapping("/by-nome/{nome}")
    public Utente getUtentiByNome(@PathVariable String nome) {
        return utenteService.getUtenteByNome(nome);

    }

    @PostMapping("/creaUtente")
    public void creaUtente( @Valid  @RequestBody UtenteDto utente) {
        utenteService.creaUtente(utente);
    }
    
    @GetMapping("/mario")
    public List<Utente> getUtenteByName() {
        return utenteService.getUtenteMario("mario");
    }
    
}


