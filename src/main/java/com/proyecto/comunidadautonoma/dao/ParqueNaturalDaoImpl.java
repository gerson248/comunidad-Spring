package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;

public class ParqueNaturalDaoImpl extends AbstractSession implements ParqueNaturalDao{

	@Override
	public void saveTeacher(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		getSession().persist(parqueNatural);
	}

	@Override
	public void deleteTeacherById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		ParqueNatural parqueNatural= findById(idParqueNatural);
		if(parqueNatural!=null) {
			getSession().delete(parqueNatural);
		}
	}

	@Override
	public void updateTeacher(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		getSession().update(parqueNatural);
	}

	@Override
	public List<ParqueNatural> findAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParqueNatural findById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParqueNatural findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
