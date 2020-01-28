package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Animal;

public interface AnimalService {
	
	void saveAnimal(Animal animal);
	
	void deleteAnimalById(Long idEspecie);
	
	void updateAnimal(Animal animal);
	
	List<Animal>findAllAnimal();
	
	Animal findById(long idEspecie);
	
	Animal findByName(String name);
	
	List<Animal> findByIdEspecie(Long idEspecie);
}
