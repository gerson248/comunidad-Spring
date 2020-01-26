package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ComunidadAutonoma implements Serializable {
	
	@Id
	@Column(name="CODCA")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codca;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="ORGRESPONSABLE")
	private String orgResponsable;
	
	
	public ComunidadAutonoma(int codca, String nombre, String orgResponsable) {
		super();
		this.codca = codca;
		this.nombre = nombre;
		this.orgResponsable = orgResponsable;
	}
	public ComunidadAutonoma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodca() {
		return codca;
	}
	public void setCodca(int codca) {
		this.codca = codca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOrgResponsable() {
		return orgResponsable;
	}
	public void setOrgResponsable(String orgResponsable) {
		this.orgResponsable = orgResponsable;
	}
	
	
	
}
