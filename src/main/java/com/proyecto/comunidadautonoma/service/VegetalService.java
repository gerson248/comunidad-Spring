package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Animal;
import com.proyecto.comunidadautonoma.model.Vegetal;

public interface VegetalService {
	
	void saveVegetal(Vegetal vegetal);
	
	void deleteVegetalById(Long idEspecie);
	
	void updateVegetal(Vegetal vegetal);
	
	List<Vegetal>findAllVegetal();
	
	Vegetal findById(long idEspecie);
	
	Animal findByName(String name);
	
	List<Vegetal> findByIdEspecie(Long idEspecie);
}
