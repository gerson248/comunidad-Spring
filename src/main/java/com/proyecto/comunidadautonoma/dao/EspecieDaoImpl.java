package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.proyecto.comunidadautonoma.model.Especie;

@Repository
@Transactional
public class EspecieDaoImpl extends AbstractSession implements EspecieDao {

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



}