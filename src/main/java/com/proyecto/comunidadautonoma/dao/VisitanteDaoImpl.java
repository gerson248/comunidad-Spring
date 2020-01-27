package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;
import com.proyecto.comunidadautonoma.model.Visitante;

public class VisitanteDaoImpl  extends AbstractSession implements VisitanteDao{

	@Override
	public void saveVisitante(Visitante visitante) {
		// TODO Auto-generated method stub
		getSession().save(visitante);
	}

	@Override
	public void deleteVisitanteById(Long idVisitante) {
		// TODO Auto-generated method stub
		Visitante visitante= findById(idVisitante);
		if(visitante!=null) {
			getSession().delete(visitante);
		}
	}

	@Override
	public void updateVisitante(Visitante visitante) {
		// TODO Auto-generated method stub
		getSession().update(visitante);
	}

	@Override
	public List<Visitante> findAllVisitante() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitante findById(long idVisitante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitante findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitante> findByIdExcursion(Long idExcursion) {
		// TODO Auto-generated method stub
		return null;
	}

}
