package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Animal;
import com.proyecto.comunidadautonoma.model.Mineral;

public interface MineralDao {
	void saveMineral(Mineral mineral);
	
	void deleteMineralById(Long idEspecie);
	
	void updateMineral(Mineral mineral);
	
	List<Mineral>findAllMineral();
	
	Mineral findById(long idEspecie);
	
	Mineral findByName(String name);
	
	List<Mineral> findByIdEspecie(Long idEspecie);
}

