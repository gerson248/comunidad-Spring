package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.ExcursionDao;
import com.proyecto.comunidadautonoma.model.Excursion;

@Service("excursionService")
@Transactional
public class ExcursionServiceImpl implements ExcursionService  {

	@Autowired
	private ExcursionDao _excursionDao;
	
	@Override
	public void saveExcursion(Excursion excursion) {
		// TODO Auto-generated method stub
		_excursionDao.saveExcursion(excursion);
	} 

	@Override
	public void deleteExcursionById(Long idExcursion) {
		// TODO Auto-generated method stub
		Excursion excursion= findById(idExcursion);
		if(excursion!=null) {
			_excursionDao.deleteExcursionById(idExcursion);
		}
	}

	@Override
	public void updateExcursion(Excursion excursion) {
		// TODO Auto-generated method stub
		_excursionDao.updateExcursion(excursion);
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
	public List<Excursion> findByIdParqueNatural(Long idParqueNatural) {
		// TODO Auto-generated method stub
		return null;
	}

}