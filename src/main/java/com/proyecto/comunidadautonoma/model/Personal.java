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
@Table(name="personal")
public class Personal implements Serializable{
	@Id
	@Column(name="codpersonal")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codPersonal;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="tfnoDomicilio")
	private Long tfnoDomicilio;
	
	@Column(name="tfnMovil")
	private Long tfnMovil;
	
	@Column(name="sueldo")
	private double sueldo;
	
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codpn")
	private ParqueNatural parquenatural;
	
	public Personal(String nombre, String direccion, Long tfnoDomicilio, Long tfnMovil, double sueldo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.tfnoDomicilio = tfnoDomicilio;
		this.tfnMovil = tfnMovil;
		this.sueldo = sueldo;
	}
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodPersonal() {
		return codPersonal;
	}
	public void setCodPersonal(Long codPersonal) {
		this.codPersonal = codPersonal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getTfnoDomicilio() {
		return tfnoDomicilio;
	}
	public void setTfnoDomicilio(Long tfnoDomicilio) {
		this.tfnoDomicilio = tfnoDomicilio;
	}
	public Long getTfnMovil() {
		return tfnMovil;
	}
	public void setTfnMovil(Long tfnMovil) {
		this.tfnMovil = tfnMovil;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ParqueNatural getParquenatural() {
		return parquenatural;
	}
	public void setParquenatural(ParqueNatural parquenatural) {
		this.parquenatural = parquenatural;
	}
	
	
}
