package com.mariana.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.taller.models.Avion;

public interface IAvionRepository extends JpaRepository<Avion, Long> {

}
