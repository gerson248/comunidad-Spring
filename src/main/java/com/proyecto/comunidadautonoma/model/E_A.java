package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

public class E_A implements Serializable{
	
	private Especie especie;
	private Area area;
	private Long cantIndividuos;
	
	
	public E_A(Especie especie, Area area, Long cantIndividuos) {
		super();
		this.especie = especie;
		this.area = area;
		this.cantIndividuos = cantIndividuos;
	}
	public E_A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Long getCantIndividuos() {
		return cantIndividuos;
	}
	public void setCantIndividuos(Long cantIndividuos) {
		this.cantIndividuos = cantIndividuos;
	}
	
	
	
	
}
