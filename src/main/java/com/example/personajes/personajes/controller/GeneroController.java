package com.example.personajes.personajes.controller;

import com.example.personajes.personajes.dto.GeneroDTO;
import com.example.personajes.personajes.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("generos")

public class GeneroController {
    @Autowired   // Enlaza ambas clases Controllador y Servicio.
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero) {
        GeneroDTO generoGuardado = generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado); // respondemos 201 (exito) y un body
    }
}