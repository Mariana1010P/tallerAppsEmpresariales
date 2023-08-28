package com.mariana.taller.models;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellidos;
	private int cedula;
	private String direccion;
	private int edad;
	private Date fechaNacimiento;
	
	public Persona(Long id, String nombre, String apellidos, int cedula, String direccion, int edad,Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.direccion = direccion;
		this.edad = edad;
	}
	
	
	public Persona() {
		super();
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
