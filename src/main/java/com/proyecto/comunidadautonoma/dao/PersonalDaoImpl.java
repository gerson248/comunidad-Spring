package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.proyecto.comunidadautonoma.model.Personal;
import com.proyecto.comunidadautonoma.model.Vegetal;

@Repository
@Transactional
public class PersonalDaoImpl extends AbstractSession implements PersonalDao {

	@Override
	public void savePersonal(Personal personal) {
		// TODO Auto-generated method stub
		getSession().save(personal);
	}

	@Override
	public void deletePersonalById(Long idPersonal) {
		// TODO Auto-generated method stub
		Personal personal= findById(idPersonal);
		if(personal!=null) {
			getSession().delete(idPersonal);
		}
	}

	@Override
	public void updatePersonal(Personal personal) {
		// TODO Auto-generated method stub
		getSession().update(personal);
	}

	@Override
	public List<Personal> findAllPersonal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal findById(long idPersonal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
