package com.proyecto.comunidadautonoma.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.comunidadautonoma.dao.AreaDao;
import com.proyecto.comunidadautonoma.model.Area;

@Service("areaService")
@Transactional
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao _areaDao;
	
	@Override
	public void saveArea(Area area) {
		// TODO Auto-generated method stub
		_areaDao.saveArea(area);
	}

	@Override
	public void deleteAreaById(Long idArea) {
		// TODO Auto-generated method stub
		Area area= findById(idArea);
		if(area!=null) {
			_areaDao.deleteAreaById(idArea);
		}
	}

	@Override
	public void updateArea(Area area) {
		// TODO Auto-generated method stub
		_areaDao.updateArea(area);
	}

	@Override
	public List<Area> findAllArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area findById(Long idArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Area findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}