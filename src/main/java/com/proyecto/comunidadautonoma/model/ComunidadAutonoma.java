package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="comunidad_autonoma")
public class ComunidadAutonoma implements Serializable{
	
	@Id
	@Column(name="codca")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codca;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="orgResponsable")
	private String orgResponsable;
	
	
	@OneToMany
	@JoinColumn(name="codca")
	@JsonIgnore
	private Set<ComunidadParque> co_pa;
	
	public ComunidadAutonoma( String nombre, String orgResponsable) {
		super();
		this.nombre = nombre;
		this.orgResponsable = orgResponsable;
	}
	public ComunidadAutonoma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodca() {
		return codca;
	}
	public void setCodca(Long codca) {
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
	public Set<ComunidadParque> getCo_pa() {
		return co_pa;
	}
	public void setCo_pa(Set<ComunidadParque> co_pa) {
		this.co_pa = co_pa;
	}
	
	
}
