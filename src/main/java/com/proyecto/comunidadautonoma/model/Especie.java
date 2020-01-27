package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

public class Especie implements Serializable{
	private Long codEspecie;
	private String nombreCientifico;
	private String nombreVulgar;
	
	
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
	
	
}
