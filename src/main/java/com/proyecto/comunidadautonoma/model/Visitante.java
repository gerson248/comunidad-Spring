 package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="visitante")
public class Visitante implements Serializable {
	
	@Id
	@Column(name="dni")
	private Long dni;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="domicilio")
	private String domicilio;
	
	@Column(name="profesion")
	private String profesion;
	
	/*@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name="ev",joinColumns= {@JoinColumn(name="dni")},inverseJoinColumns= {@JoinColumn(name="codexcursion")})*/
	@ManyToMany(cascade= {CascadeType.ALL}, mappedBy="visitante")
	private Set<Excursion> excursiones;
	
	public Visitante(Long dni, String nombre, String domicilio, String profesion) {
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
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public Set<Excursion> getExcursiones() {
		return excursiones;
	}
	public void setExcursiones(Set<Excursion> excursiones) {
		this.excursiones = excursiones;
	}
	
	
	
}
