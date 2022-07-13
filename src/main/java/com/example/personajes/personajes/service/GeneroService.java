package com.example.personajes.personajes.service;

import com.example.personajes.personajes.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {

    public GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();

}