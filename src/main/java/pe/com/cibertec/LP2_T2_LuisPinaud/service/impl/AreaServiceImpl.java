package pe.com.cibertec.LP2_T2_LuisPinaud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.LP2_T2_LuisPinaud.model.entity.AreaEntity;
import pe.com.cibertec.LP2_T2_LuisPinaud.repository.AreaRepository;
import pe.com.cibertec.LP2_T2_LuisPinaud.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaRepository areaRepository;
	
	@Override
	public List<AreaEntity> listarAreas() {
		
		return areaRepository.findAll();
	}

}
