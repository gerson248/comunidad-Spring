package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.util.Set;


@Entity
@Table(name="parquenatural")
public class ParqueNatural implements Serializable {
	
	@Id
	@Column(name="codpn")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codPN;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fechadeclaracion")
	private Date fechaDeclaracion;
	
	@OneToMany(mappedBy="parquenatural")
	@JsonIgnore
	private Set<Excursion> excursiones;
	
	@OneToMany(mappedBy="parquenatural")
	@JsonIgnore
	private Set<Personal> personales;
	
	@OneToMany(mappedBy="parquenatural")
	@JsonIgnore
	private Set<Area> areas;
	
	
	
	public ParqueNatural(String nombre, Date fechaDeclaracion) {
		super();
		this.nombre = nombre;
		this.fechaDeclaracion = fechaDeclaracion;
	}
	public ParqueNatural() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodPN() {
		return codPN;
	}
	public void setCodPN(int codPN) {
		this.codPN = codPN;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeclaracion() {
		return fechaDeclaracion;
	}
	public void setFechaDeclaracion(Date fechaDeclaracion) {
		this.fechaDeclaracion = fechaDeclaracion;
	}
	public Set<Excursion> getExcursiones() {
		return excursiones;
	}
	public void setExcursiones(Set<Excursion> excursiones) {
		this.excursiones = excursiones;
	}
	public Set<Personal> getPersonales() {
		return personales;
	}
	public void setPersonales(Set<Personal> personales) {
		this.personales = personales;
	}
	public Set<Area> getAreas() {
		return areas;
	}
	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}	
	
}
