package com.example.personajes.personajes.service;

import com.example.personajes.personajes.dto.GeneroDTO;
import org.springframework.stereotype.Service;
@Service
public class GeneroService {

    public GeneroDTO save(GeneroDTO dto){
        // TODO: falta guardar continente en la base de datos (solo llegamos hasta la capa service y retornamos la misma informacion que se ingreso)
        System.out.println("Guardar continente");
        return dto;
    }




}