package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.ParqueNaturalDao;
import com.proyecto.comunidadautonoma.model.ParqueNatural;

@Service("parqueNaturalService")
@Transactional
public class ParqueNaturalServiceImpl implements ParqueNaturalService{
	
	@Autowired
	private ParqueNaturalDao _parqueNaturalDao;
	
	@Override
	public void saveParqueNatural(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		_parqueNaturalDao.saveParqueNatural(parqueNatural);
	}

	@Override
	public void deleteParqueNaturalById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		ParqueNatural parqueNatural= findById(idParqueNatural);
		if(parqueNatural!=null) {
			_parqueNaturalDao.deleteParqueNaturalById(idParqueNatural);
		}
	}

	@Override
	public void updateParqueNatural(ParqueNatural parqueNatural) {
		// TODO Auto-generated method stub
		_parqueNaturalDao.updateParqueNatural(parqueNatural);
	}

	@Override
	public List<ParqueNatural> findAllParqueNaturales() {
		// TODO Auto-generated method stub
		return _parqueNaturalDao.findAllParqueNaturales();
	}

	@Override
	public ParqueNatural findById(Long idParqueNatural) {
		// TODO Auto-generated method stub
		return _parqueNaturalDao.findById(idParqueNatural);
	}

	@Override
	public ParqueNatural findByName(String name) {
		// TODO Auto-generated method stub
		return _parqueNaturalDao.findByName(name);
	}

}