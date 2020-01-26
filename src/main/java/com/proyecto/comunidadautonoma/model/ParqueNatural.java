package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class ParqueNatural implements Serializable {
	
	@Id
	@Column(name="CODPN")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codPN;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FECHADECLARACION")
	private Date fechaDeclaracion;
	
	public ParqueNatural(int codPN, String nombre, Date fechaDeclaracion) {
		super();
		this.codPN = codPN;
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
	
	
}
