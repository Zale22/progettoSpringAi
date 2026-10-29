package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}



classe x  


Utente u = new Utente();  //heap

String piGreco = "3.14";  //stack

Garbage Collector (GC) è un processo automatico di gestione della memoria in Java che si occupa di liberare
 la memoria occupata da oggetti che non sono più raggiungibili 
 o utilizzati nel programma. 
 In altre parole, il GC identifica gli oggetti che non hanno più riferimenti attivi e li rimuove dalla memoria,
  consentendo al sistema di riutilizzare quella memoria per nuovi oggetti.

  LAZY