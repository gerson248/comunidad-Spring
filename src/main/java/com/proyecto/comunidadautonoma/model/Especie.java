package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="especie")
public class Especie implements Serializable{
	
	@Id
	@Column(name="codespecie")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codEspecie;
	
	@Column(name="nombreCientifico")
	private String nombreCientifico;
	
	@Column(name="nombreVulgar")
	private String nombreVulgar;
	
	@OneToMany
	@JoinColumn(name="codespecie")
	@JsonIgnore
	private Set<EspecieAnimal> e_a;
	
	
	public Especie(String nombreCientifico, String nombreVulgar) {
		super();
		this.nombreCientifico = nombreCientifico;
		this.nombreVulgar = nombreVulgar;
	}
	public Especie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodEspecie() {
		return codEspecie;
	}
	public void setCodEspecie(Long codEspecie) {
		this.codEspecie = codEspecie;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public Set<EspecieAnimal> getE_a() {
		return e_a;
	}
	public void setE_a(Set<EspecieAnimal> e_a) {
		this.e_a = e_a;
	}
	
	
}
