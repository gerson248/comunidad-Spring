package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Especie;

public interface EspecieDao {
	
	void saveEspecie(Especie especie);

	void deleteEspecieById(Long idEspecie);

	void updateEspecie(Especie especie);

	List<Especie>findAllEspecie();

	Especie findById(long idEspecie);

	Especie findByName(String name);

	List<Especie> findByIdAnimal(Long idAnimal);
	
	List<Especie> findByIdVegetal(Long idVegetal);
	
	List<Especie> findByIdMineral(Long idMineral);
}