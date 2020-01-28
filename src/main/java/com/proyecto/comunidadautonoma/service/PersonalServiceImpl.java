package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.PersonalDao;
import com.proyecto.comunidadautonoma.model.Personal;

@Service("PersonalService")
@Transactional
public class PersonalServiceImpl implements PersonalService {
	
	@Autowired
	private PersonalDao _personalDao;
	
	@Override
	public void savePersonal(Personal personal) {
		// TODO Auto-generated method stub
		_personalDao.savePersonal(personal);
	}

	@Override
	public void deletePersonalById(Long idPersonal) {
		// TODO Auto-generated method stub
		Personal personal= findById(idPersonal);
		if(personal!=null) {
			_personalDao.deletePersonalById(idPersonal);
		}
	}

	@Override
	public void updatePersonal(Personal personal) {
		// TODO Auto-generated method stub
		_personalDao.updatePersonal(personal);
	}

	@Override
	public List<Personal> findAllPersonal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal findById(long idPersonal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personal findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}