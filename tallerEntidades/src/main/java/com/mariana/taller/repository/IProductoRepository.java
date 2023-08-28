package com.mariana.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.taller.models.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
