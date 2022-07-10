package com.example.personajes.personajes.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

@Getter
@Setter


public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;   // URL
    private String nombre;
    private int edad;
    private int peso;
    private Long historia;



    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PeliculaSerieEntity> pelioserie = new ArrayList<>();


}











