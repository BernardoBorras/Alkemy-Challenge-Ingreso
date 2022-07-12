package com.example.personajes.personajes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GeneroDTO {

    // Atributos necesarios para que los objetos de esta clase puedan transportar datos del genero.

    private Long id;
    private String nombre;
    private String imagen;

}