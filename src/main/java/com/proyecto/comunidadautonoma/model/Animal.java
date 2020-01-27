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
@Table(name="animal")
public class Animal implements Serializable{

	
	@Column(name="alimentacion")
	private String alimentacion;
	
	@Column(name="periodocelo")
	private String periodoCelo;
	
	@Id
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codespecie")
	private Especie especie;
	
	
	public Animal(String alimentacion, String periodoCelo) {
		super();
		this.alimentacion = alimentacion;
		this.periodoCelo = periodoCelo;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getPeriodoCelo() {
		return periodoCelo;
	}

	public void setPeriodoCelo(String periodoCelo) {
		this.periodoCelo = periodoCelo;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
}
