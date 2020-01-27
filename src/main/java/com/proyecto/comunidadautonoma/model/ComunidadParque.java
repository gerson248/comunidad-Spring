package com.proyecto.comunidadautonoma.model;

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
@Table(name="ca_pn")
public class ComunidadParque {
	
	@Id
	@Column(name="codcp")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codCP;
	
	@Column(name="superficie")
	private String superficie;
	
	
	//@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codca")
	private ComunidadAutonoma comunidadAutonoma;
	
	//@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codpn")
	private ParqueNatural parqueNatural;
	
	

	public ComunidadParque(String superficie, ComunidadAutonoma comunidadAutonoma, ParqueNatural parqueNatural) {
		super();
		this.superficie = superficie;
		this.comunidadAutonoma = comunidadAutonoma;
		this.parqueNatural = parqueNatural;
	}

	public ComunidadParque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodCP() {
		return codCP;
	}

	public void setCodCP(Long codCP) {
		this.codCP = codCP;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public ComunidadAutonoma getComunidadAutonoma() {
		return comunidadAutonoma;
	}

	public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}

	public ParqueNatural getParqueNatural() {
		return parqueNatural;
	}

	public void setParqueNatural(ParqueNatural parqueNatural) {
		this.parqueNatural = parqueNatural;
	}
	
	
}
