package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Animal;
import com.proyecto.comunidadautonoma.model.Vegetal;

public class AnimalServiceImpl  extends AbstractSession implements AnimalService {

	@Override
	public void saveAnimal(Animal course) {
		// TODO Auto-generated method stub
		getSession().save(course);
	}

	@Override
	public void deleteAnimalById(Long idEspecie) {
		// TODO Auto-generated method stub
		Animal animal= findById(idEspecie);
		if(animal!=null) {
			getSession().delete(idEspecie);
		}
	}

	@Override
	public void updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		getSession().update(animal);
	}

	@Override
	public List<Animal> findAllAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal findById(long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Animal> findByIdEspecie(Long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
