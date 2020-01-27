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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="area")
public class Area implements Serializable{
	
	@Id
	@Column(name="coda")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long coda;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="extension")
	private double extension;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="coda")
	private Set<EspecieArea> e_a;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codpn")
	private ParqueNatural parquenatural;
	

	
	
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
	public ParqueNatural getParquenatural() {
		return parquenatural;
	}
	public void setParquenatural(ParqueNatural parquenatural) {
		this.parquenatural = parquenatural;
	}
	public Set<EspecieArea> getE_a() {
		return e_a;
	}
	public void setE_a(Set<EspecieArea> e_a) {
		this.e_a = e_a;
	}
	
	
}
