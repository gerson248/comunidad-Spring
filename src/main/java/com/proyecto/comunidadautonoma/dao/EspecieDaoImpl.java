package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Especie;
import com.proyecto.comunidadautonoma.model.Excursion;

public class EspecieDaoImpl extends AbstractSession implements EspecieDao{

	@Override
	public void saveEspecie(Especie especie) {
		// TODO Auto-generated method stub
		getSession().save(especie);
	}

	@Override
	public void deleteEspecieById(Long idEspecie) {
		// TODO Auto-generated method stub
		Especie especie= findById(idEspecie);
		if(especie!=null) {
			getSession().delete(idEspecie);
		}
	}

	@Override
	public void updateEspecie(Especie especie) {
		// TODO Auto-generated method stub
		getSession().update(especie);
	}

	@Override
	public List<Especie> findAllEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especie findById(long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especie findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especie> findByIdAnimal(Long idAnimal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especie> findByIdVegetal(Long idVegetal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especie> findByIdMineral(Long idMineral) {
		// TODO Auto-generated method stub
		return null;
	}

}
