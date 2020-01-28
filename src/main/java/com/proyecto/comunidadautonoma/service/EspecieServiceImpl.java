package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.EspecieDao;
import com.proyecto.comunidadautonoma.model.Especie;

@Service("especieService")
@Transactional
public class EspecieServiceImpl implements EspecieService {
	
	@Autowired
	private EspecieDao _especieDao;
	
	@Override
	public void saveEspecie(Especie especie) {
		// TODO Auto-generated method stub
		_especieDao.saveEspecie(especie);
	}

	@Override
	public void deleteEspecieById(Long idEspecie) {
		// TODO Auto-generated method stub
		Especie especie= findById(idEspecie);
		if(especie!=null) {
			_especieDao.deleteEspecieById(idEspecie);
		}
	}

	@Override
	public void updateEspecie(Especie especie) {
		// TODO Auto-generated method stub
		_especieDao.updateEspecie(especie);
	}

	@Override
	public List<Especie> findAllEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especie findById(long idEspecie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especie findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}