package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.proyecto.comunidadautonoma.model.Animal;
import com.proyecto.comunidadautonoma.model.Vegetal;
import com.proyecto.comunidadautonoma.model.Visitante;

@Repository
@Transactional
public class VegetalDaoImpl extends AbstractSession implements VegetalDao{

	@Override
	public void saveVegetal(Vegetal vegetal) {
		// TODO Auto-generated method stub
		getSession().save(vegetal);
	}

	@Override
	public void deleteVegetalById(Long idEspecie) {
		// TODO Auto-generated method stub
		Vegetal vegetal= findById(idEspecie);
		if(vegetal!=null) {
			getSession().delete(idEspecie);
		}
	}

	@Override
	public void updateVegetal(Vegetal vegetal) {
		// TODO Auto-generated method stub
		getSession().update(vegetal);
	}

	@Override
	public List<Vegetal> findAllVegetal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vegetal findById(long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vegetal> findByIdEspecie(Long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

}
