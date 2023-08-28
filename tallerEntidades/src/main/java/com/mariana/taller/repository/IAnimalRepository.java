package com.mariana.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.taller.models.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Long>{

}
