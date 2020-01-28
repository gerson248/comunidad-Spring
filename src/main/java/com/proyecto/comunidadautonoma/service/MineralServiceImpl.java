package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.MineralDao;
import com.proyecto.comunidadautonoma.model.Mineral;

@Service("mineralService")
@Transactional
public class MineralServiceImpl implements MineralService{

	@Autowired
	private MineralDao _mineralDao;
	
	@Override
	public void saveMineral(Mineral mineral) {
		// TODO Auto-generated method stub
		_mineralDao.saveMineral(mineral);
	}

	@Override
	public void deleteMineralById(Long idEspecie) {
		// TODO Auto-generated method stub
		Mineral mineral= findById(idEspecie);
		if(mineral!=null) {
			_mineralDao.deleteMineralById(idEspecie);
		}
	}

	@Override
	public void updateMineral(Mineral mineral) {
		// TODO Auto-generated method stub
		_mineralDao.updateMineral(mineral);
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