package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Mineral;
import com.proyecto.comunidadautonoma.model.Vegetal;

public class MineralDaoImpl  extends AbstractSession implements MineralDao{

	@Override
	public void saveMineral(Mineral mineral) {
		// TODO Auto-generated method stub
		getSession().save(mineral);
	}

	@Override
	public void deleteMineralById(Long idEspecie) {
		// TODO Auto-generated method stub
		Mineral mineral= findById(idEspecie);
		if(mineral!=null) {
			getSession().delete(idEspecie);
		}
	}

	@Override
	public void updateMineral(Mineral mineral) {
		// TODO Auto-generated method stub
		getSession().update(mineral);
	}

	@Override
	public List<Mineral> findAllMineral() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mineral findById(long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mineral findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mineral> findByIdEspecie(Long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

}
