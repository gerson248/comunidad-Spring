package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Personal;

public interface PersonalDao {
	
	void savePersonal(Personal personal);
	
	void deletePersonalById(Long idPersonal);
	
	void updatePersonal(Personal personal);
	
	List<Personal>findAllPersonal();
	
	Personal findById(long idPersonal);
	
	Personal findByName(String name);
	
} 
