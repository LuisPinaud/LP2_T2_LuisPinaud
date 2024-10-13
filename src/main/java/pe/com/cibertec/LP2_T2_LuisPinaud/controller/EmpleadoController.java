package pe.com.cibertec.LP2_T2_LuisPinaud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.cibertec.LP2_T2_LuisPinaud.model.entity.AreaEntity;
import pe.com.cibertec.LP2_T2_LuisPinaud.model.entity.EmpleadoEntity;
import pe.com.cibertec.LP2_T2_LuisPinaud.service.AreaService;
import pe.com.cibertec.LP2_T2_LuisPinaud.service.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/")
	public String listarEmpleados(Model model) {
		List<EmpleadoEntity> listaEm = empleadoService.listarEmpleados();
		model.addAttribute("lstEmpleado", listaEm);
		return "lista_empleado";
	}
	
	@GetMapping("/registrar_empleado")
	public String mostrarRegistrarEmpleado(Model model) {
		List<AreaEntity> listaArea = areaService.listarAreas();
		model.addAttribute("areas", listaArea);
		model.addAttribute("empleado", new EmpleadoEntity());
		return "registrar_empleado";
	}
	
	@PostMapping("/registrar_empleado")
	public String registrarEmpleado(@ModelAttribute("empleado") EmpleadoEntity emple, Model model) {
		empleadoService.crearEmpleado(emple);
		return "redirect:/empleado/";
	}
	
}
