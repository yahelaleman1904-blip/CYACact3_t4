package com.yahel.crud_act3.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Videojuego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String genero;

    @ManyToOne
    @JoinColumn(name = "consola_id")
    @JsonIgnoreProperties("videojuegos")
    private Consola consola;

    public Videojuego() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Consola getConsola() { return consola; }
    public void setConsola(Consola consola) { this.consola = consola; }
}