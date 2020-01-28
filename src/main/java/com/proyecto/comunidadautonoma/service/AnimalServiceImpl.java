package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.AnimalDao;
import com.proyecto.comunidadautonoma.model.Animal;

@Service("animalService")
@Transactional
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalDao _animalDao;
	
	@Override
	public void saveAnimal(Animal animal) {
		// TODO Auto-generated method stub
		_animalDao.saveAnimal(animal);
	}
	
	@Override
	public void deleteAnimalById(Long idEspecie) {
		// TODO Auto-generated method stub
		Animal animal= findById(idEspecie);
		if(animal!=null) {
			_animalDao.deleteAnimalById(idEspecie);
		}
	}
	
	@Override
	public void updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		_animalDao.updateAnimal(animal);
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