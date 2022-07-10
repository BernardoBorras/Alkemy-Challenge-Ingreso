package com.example.personajes.personajes.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity   // Declara que esta clase es una Entidad
@Table(name = "genero")    // Indica que tabla se esta mapeando
@Getter
@Setter

public class GeneroEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;

    private String imagen;

    // peliculas o series asociadas
}
