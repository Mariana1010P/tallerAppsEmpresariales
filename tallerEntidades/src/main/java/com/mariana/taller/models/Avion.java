package com.mariana.taller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tipo;
	private String marca;
	private String modelo;
	private String provedor;
	private double precio;
	
	
	public Avion(Long id, String tipo, String marca, String modelo, String provedor, double precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.provedor = provedor;
		this.precio = precio;
	}
	
	public Avion() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProvedor() {
		return provedor;
	}
	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
