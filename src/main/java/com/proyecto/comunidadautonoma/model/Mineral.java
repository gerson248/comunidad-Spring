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
@Table(name="mineral")
public class Mineral implements Serializable{
	
	@Id
	@Column(name="codmineral")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codMineral;
	
	@Column(name="tipo")
	private String tipo;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codespecie")
	private Especie especie;

	public Mineral(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Mineral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getCodMineral() {
		return codMineral;
	}

	public void setCodMineral(Long codMineral) {
		this.codMineral = codMineral;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	
}
