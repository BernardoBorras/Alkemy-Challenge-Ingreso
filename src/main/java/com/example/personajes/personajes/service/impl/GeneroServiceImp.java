package com.example.personajes.personajes.service.impl;

import com.example.personajes.personajes.dto.GeneroDTO;
import com.example.personajes.personajes.entity.GeneroEntity;
import com.example.personajes.personajes.mapper.GeneroMapper;
import com.example.personajes.personajes.repository.GeneroRepository;
import com.example.personajes.personajes.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GeneroServiceImp implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;


    public GeneroDTO save(GeneroDTO dto){
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }


}