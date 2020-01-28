package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;

public class ParqueNaturalServiceImpl extends AbstractSession implements ParqueNaturalService{

	@Override
	public void saveParqueNatural(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		getSession().persist(parqueNatural);
	}

	@Override
	public void deleteParqueNaturalById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		ParqueNatural parqueNatural= findById(idParqueNatural);
		if(parqueNatural!=null) {
			getSession().delete(parqueNatural);
		}
	}

	@Override
	public void updateParqueNatural(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		getSession().update(parqueNatural);
	}

	@Override
	public List<ParqueNatural> findAllParqueNaturales() {
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

	/*@Override
	public List<ParqueNatural> findByIdExcursion(Long idExcursion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ParqueNatural> findByIdPersonal(Long idPersonal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ParqueNatural> findByIdArea(Long idArea) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
