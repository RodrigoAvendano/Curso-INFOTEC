package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Personas;

public interface PersonasRepository extends JpaRepository<Personas,Integer> {

}
