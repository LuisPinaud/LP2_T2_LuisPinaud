package pe.com.cibertec.LP2_T2_LuisPinaud.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_area")
public class AreaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="area_id")
	private Integer areaId;
	
	@Column(name="nombre_area", length = 45, nullable = false)
	private String nombreArea;

	public AreaEntity(Integer areaId, String nombreArea) {
		super();
		this.areaId = areaId;
		this.nombreArea = nombreArea;
	}

	public AreaEntity() {
		super();
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	
	
}
