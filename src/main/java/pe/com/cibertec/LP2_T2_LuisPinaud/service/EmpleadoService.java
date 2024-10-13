package pe.com.cibertec.LP2_T2_LuisPinaud.service;

import java.util.List;

import pe.com.cibertec.LP2_T2_LuisPinaud.model.entity.EmpleadoEntity;

public interface EmpleadoService {
	List<EmpleadoEntity>listarEmpleados();
	void crearEmpleado (EmpleadoEntity empleadoEntity);
}
