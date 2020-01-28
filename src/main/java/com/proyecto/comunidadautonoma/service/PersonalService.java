package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Personal;

public interface PersonalService {
	
	void savePersonal(Personal personal);
	
	void deletePersonalById(Long idPersonal);
	
	void updatePersonal(Personal personal);
	
	List<Personal>findAllPersonal();
	
	Personal findById(long idPersonal);
	
	Personal findByName(String name);
	
} 
