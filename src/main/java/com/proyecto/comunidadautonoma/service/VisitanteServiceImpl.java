package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.VisitanteDao;
import com.proyecto.comunidadautonoma.model.Visitante;

@Service("visitanteService")
@Transactional
public class VisitanteServiceImpl implements VisitanteService{

	@Autowired
	private VisitanteDao _visitanteDao;
	
	@Override
	public void saveVisitante(Visitante visitante) {
		// TODO Auto-generated method stub
		_visitanteDao.saveVisitante(visitante);
	}

	@Override
	public void deleteVisitanteById(Long idVisitante) {
		// TODO Auto-generated method stub
		Visitante visitante= findById(idVisitante);
		if(visitante!=null) {
			_visitanteDao.deleteVisitanteById(idVisitante);
		}
	}

	@Override
	public void updateVisitante(Visitante visitante) {
		// TODO Auto-generated method stub
		_visitanteDao.updateVisitante(visitante);
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