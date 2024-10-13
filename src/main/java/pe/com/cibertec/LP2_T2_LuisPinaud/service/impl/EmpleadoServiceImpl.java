package pe.com.cibertec.LP2_T2_LuisPinaud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.LP2_T2_LuisPinaud.model.entity.EmpleadoEntity;
import pe.com.cibertec.LP2_T2_LuisPinaud.repository.EmpleadoRepository;
import pe.com.cibertec.LP2_T2_LuisPinaud.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	
	@Override
	public List<EmpleadoEntity> listarEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public void crearEmpleado(EmpleadoEntity empleadoEntity) {
		empleadoRepository.save(empleadoEntity);
	}

}
