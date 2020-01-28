package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.VegetalDao;
import com.proyecto.comunidadautonoma.model.Animal;
import com.proyecto.comunidadautonoma.model.Vegetal;

@Service("vegetalService")
@Transactional
public class VegetalServiceImpl implements VegetalService{
	
	@Autowired
	private VegetalDao _vegetalDao;
	
	@Override
	public void saveVegetal(Vegetal vegetal) {
		// TODO Auto-generated method stub
		_vegetalDao.saveVegetal(vegetal);
	}

	@Override
	public void deleteVegetalById(Long idEspecie) {
		// TODO Auto-generated method stub
		Vegetal vegetal= findById(idEspecie);
		if(vegetal!=null) {
			_vegetalDao.deleteVegetalById(idEspecie);
		}
	}

	@Override
	public void updateVegetal(Vegetal vegetal) {
		// TODO Auto-generated method stub
		_vegetalDao.updateVegetal(vegetal);
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