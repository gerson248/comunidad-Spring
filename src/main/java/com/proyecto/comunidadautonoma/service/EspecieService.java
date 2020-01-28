package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Especie;

public interface EspecieService {
	
	void saveEspecie(Especie especie);

	void deleteEspecieById(Long idEspecie);

	void updateEspecie(Especie especie);

	List<Especie>findAllEspecie();

	Especie findById(long idEspecie);

	Especie findByName(String name);


}