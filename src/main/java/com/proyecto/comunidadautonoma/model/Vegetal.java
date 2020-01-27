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
@Table(name="vegetal")
public class Vegetal implements Serializable{
	

	
	@Column(name="floracion")
	private String floracion;
	
	@Column(name="periodoFloracion")
	private String periodoFloracion;
	
	@Id
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codespecie")
	private Especie especie;
	

	public Vegetal(String floracion, String periodoFloracion) {
		super();
		this.floracion = floracion;
		this.periodoFloracion = periodoFloracion;
	}

	public Vegetal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getFloracion() {
		return floracion;
	}

	public void setFloracion(String floracion) {
		this.floracion = floracion;
	}

	public String getPeriodoFloracion() {
		return periodoFloracion;
	}

	public void setPeriodoFloracion(String periodoFloracion) {
		this.periodoFloracion = periodoFloracion;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
}
