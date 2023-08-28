package com.mariana.taller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Casa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String direccion;
	private int numPisos;
	private int numCuartos;
	private int numBanios;
	private String descripcion;
	private double precio;
	
	
	public Casa(Long id, String direccion, int numPisos, int numCuartos, int numBanios, String descripcion, double precio) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.numPisos = numPisos;
		this.numCuartos = numCuartos;
		this.numBanios = numBanios;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Casa() {
		super();
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumPisos() {
		return numPisos;
	}


	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}


	public int getNumCuartos() {
		return numCuartos;
	}


	public void setNumCuartos(int numCuartos) {
		this.numCuartos = numCuartos;
	}


	public int getNumBanios() {
		return numBanios;
	}


	public void setNumBanios(int numBanios) {
		this.numBanios = numBanios;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
