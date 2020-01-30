package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.proyecto.comunidadautonoma.model.ParqueNatural;

@Repository
@Transactional
public class ParqueNaturalDaoImpl extends AbstractSession implements ParqueNaturalDao{

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
		return getSession().createQuery("from ParqueNatural").list();
	}

	@Override
	public ParqueNatural findById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParqueNatural findByName(String nombre) {
		// TODO Auto-generated method stub
		return (ParqueNatural) getSession().createQuery("from ParqueNatural where nombre = :nombre").setParameter("nombre",nombre).uniqueResult();
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
