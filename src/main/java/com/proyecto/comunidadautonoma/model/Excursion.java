package com.proyecto.comunidadautonoma.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="excursion")
public class Excursion implements Serializable {
	
	@Id
	@Column(name="codexcursion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codExcursion;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="hora")
	private Date Hora;
	
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="codpn")
	private ParqueNatural parquenatural;
	
	public Excursion(Date fecha, Date Hora) {
		super();
		this.fecha = fecha;
		this.Hora = Hora;
	}
	public Excursion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodExcursion() {
		return codExcursion;
	}
	public void setCodExcursion(Long codExcursion) {
		this.codExcursion = codExcursion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return Hora;
	}
	public void setHora(Date hora) {
		Hora = hora;
	}

	public ParqueNatural getParquenatural() {
		return parquenatural;
	}
	public void setParquenatural(ParqueNatural parquenatural) {
		this.parquenatural = parquenatural;
	}
	
	
}
