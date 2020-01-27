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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="e_a")
public class EspecieArea implements Serializable{
	
	
	@Column(name="cantindividuos")
	private Long cantIndividuos;
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="coda")
	private Area area;
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codespecie")
	private Especie especie;
	
	
	
	public EspecieArea(Long cantIndividuos, Especie especie, Area area) {
		super();
		this.especie = especie;
		this.area = area;
		this.cantIndividuos = cantIndividuos;
	}
	public EspecieArea() {
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
