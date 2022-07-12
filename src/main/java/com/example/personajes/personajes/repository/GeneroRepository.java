package com.example.personajes.personajes.repository;


import com.example.personajes.personajes.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity,Long> {


}
