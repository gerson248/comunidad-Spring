package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

public class Area implements Serializable{
	private Long coda;
	private String nombre;
	private double extension;
	
	
	public Area(String nombre, double extension) {
		super();
		this.nombre = nombre;
		this.extension = extension;
	}
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCoda() {
		return coda;
	}
	public void setCoda(Long coda) {
		this.coda = coda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getExtension() {
		return extension;
	}
	public void setExtension(double extension) {
		this.extension = extension;
	}
	
	
}
