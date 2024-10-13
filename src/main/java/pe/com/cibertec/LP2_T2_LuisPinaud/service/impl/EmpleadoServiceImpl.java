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

	@Override
	public EmpleadoEntity buscarEmpleadoPorId(String dni) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(dni).get();
	}

	@Override
	public void actualizarEmpleado(String dni, EmpleadoEntity empleadoEntity) {
		EmpleadoEntity encontrado = buscarEmpleadoPorId(dni);
		if(encontrado == null) {
			throw new RuntimeException("Empleado no encontrado");
		}
		
		try {
			encontrado.setApellidoEmpleado(empleadoEntity.getApellidoEmpleado());
			encontrado.setNombreEmpleado(empleadoEntity.getNombreEmpleado());
			encontrado.setAreaEntity(empleadoEntity.getAreaEntity());
			encontrado.setDireccion(empleadoEntity.getDireccion());
			encontrado.setFechaNacimiento(empleadoEntity.getFechaNacimiento());
			empleadoRepository.save(encontrado);
		} catch (Exception e) {
			throw new RuntimeException("Ocurrió un error al actualizar");
		}
		
	}

	@Override
	public void eliminarEmpleado(String dni) {
		EmpleadoEntity encontrado = buscarEmpleadoPorId(dni);
		if(encontrado != null) {
			empleadoRepository.delete(encontrado);
		}
		
	}

}
