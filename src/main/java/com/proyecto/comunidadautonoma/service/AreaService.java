package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Area;

public interface AreaService {

	void saveArea(Area area);
	
	void deleteAreaById(Long idArea);
	
	void updateArea(Area area);
	
	List<Area>findAllArea();
	
	Area findById(Long idArea);
	
	Area findByName(String name);
	 
}
