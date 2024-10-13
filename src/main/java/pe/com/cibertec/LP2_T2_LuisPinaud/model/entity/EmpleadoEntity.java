package pe.com.cibertec.LP2_T2_LuisPinaud.model.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_empleado")
public class EmpleadoEntity {
	@Id
	@Column(name="dni_empleado", columnDefinition = "CHAR(8)", nullable = false)
	private String dniEmpleado;
	
	@Column(name="nombre_empleado", length = 45, nullable = false)
	private String nombreEmpleado;
	
	@Column(name="apellido_empleado", length = 45, nullable = false)
	private String apellidoEmpleado;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name="direccion", length = 45, nullable = false)
	private String direccion;
	
	@Column(name="correo", length = 45, nullable = false)
	private String correo; 
	
	@ManyToOne
	@JoinColumn(name="area_id", nullable = false)
	private AreaEntity areaEntity;

	public EmpleadoEntity(String dniEmpleado, String nombreEmpleado, String apellidoEmpleado, LocalDate fechaNacimiento,
			String direccion, String correo, AreaEntity areaEntity) {
		super();
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correo = correo;
		this.areaEntity = areaEntity;
	}

	public EmpleadoEntity() {
		super();
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public AreaEntity getAreaEntity() {
		return areaEntity;
	}

	public void setAreaEntity(AreaEntity areaEntity) {
		this.areaEntity = areaEntity;
	}
	
	
}
