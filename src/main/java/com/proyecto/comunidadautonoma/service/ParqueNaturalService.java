package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;


public interface ParqueNaturalService {
	void saveParqueNatural(ParqueNatural parqueNatural);
	
	void deleteParqueNaturalById(Long idParqueNatural);
	
	void updateParqueNatural(ParqueNatural parqueNatural);
	
	List<ParqueNatural>findAllParqueNaturales();
	
	ParqueNatural findById(Long idParqueNatural);
	
	ParqueNatural findByName(String name);

	/*List<ParqueNatural> findByIdExcursion(Long idExcursion);
	
	List<ParqueNatural> findByIdPersonal(Long idPersonal);
	
	List<ParqueNatural> findByIdArea(Long idArea);*/
}
