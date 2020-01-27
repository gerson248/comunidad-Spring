package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Area;
import com.proyecto.comunidadautonoma.model.Especie;

public class AreaDaoImpl extends AbstractSession implements AreaDao{

	@Override
	public void saveArea(Area area) {
		// TODO Auto-generated method stub
		getSession().save(area);
	}

	@Override
	public void deleteAreaById(Long idArea) {
		// TODO Auto-generated method stub
		Area area= findById(idArea);
		if(area!=null) {
			getSession().delete(idArea);
		}
	}

	@Override
	public void updateArea(Area area) {
		// TODO Auto-generated method stub
		getSession().update(area);
	}

	@Override
	public List<Area> findAllArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area findById(Long idArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
