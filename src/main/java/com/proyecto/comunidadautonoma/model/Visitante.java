package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="visitante")
public class Visitante implements Serializable{
	
	@Id
	@Column(name="DNI")
	private String dni;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DOMICILIO")
	private String domicilio;
	
	@Column(name="PROFESION")
	private String profesion;
	

	
	public Visitante(String dni, String nombre, String domicilio, String profesion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.profesion = profesion;
	}
	
	public Visitante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
