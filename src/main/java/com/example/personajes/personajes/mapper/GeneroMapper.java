package com.example.personajes.personajes.mapper;
import com.example.personajes.personajes.dto.GeneroDTO;
import com.example.personajes.personajes.entity.GeneroEntity;
import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {

    // Conversion de dto a Entidad
    public GeneroEntity generoDTO2Entity(GeneroDTO dto){
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setNombre(dto.getNombre());
        generoEntity.setImagen(dto.getImagen());
        return generoEntity;

    // Conversion de Entidad a dto
    }
    public GeneroDTO generoEntity2DTO(GeneroEntity entity){
        GeneroDTO dto = new GeneroDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setImagen(entity.getImagen());
        return dto;
    }








}
