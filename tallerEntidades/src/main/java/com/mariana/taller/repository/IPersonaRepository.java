package com.mariana.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.taller.models.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
