package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Excursion;

public class ExcursionDaoImpl extends AbstractSession implements ExcursionDao  {

	@Override
	public void saveExcursion(Excursion excursion) {
		// TODO Auto-generated method stub
		getSession().persist(excursion);
	}

	@Override
	public void deleteExcursionById(Long idExcursion) {
		// TODO Auto-generated method stub
		Excursion excursion= findById(idExcursion);
		if(excursion!=null) {
			getSession().delete(excursion);
		}
	}

	@Override
	public void updateCourse(Excursion excursion) {
		// TODO Auto-generated method stub
		getSession().update(excursion);
	}

	@Override
	public List<Excursion> findAllExcursion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Excursion findById(long idExcursion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Excursion> findByIdParqueNatural(Long idTParqueNatural) {
		// TODO Auto-generated method stub
		return null;
	}

}