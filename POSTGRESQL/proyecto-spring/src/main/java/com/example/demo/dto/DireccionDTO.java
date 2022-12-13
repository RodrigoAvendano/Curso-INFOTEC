package com.example.demo.dto;

import com.example.demo.entity.Direccion;

public class DireccionDTO {
	
	private Integer id;
	
	private String calle;
	
	private String numero_interior;
	
	private String numero_exterior;
	
	private Integer codigo_postal;
	
	private String colonia;
	
	private Integer ciudad;
	
	private Integer estado;
	
	public DireccionDTO() {
	}
	
	public DireccionDTO(Direccion direccion) {
		this.id = direccion.getId();
		this.calle = direccion.getCalle();
		this.numero_interior = direccion.getNumero_interior();
		this.numero_exterior = direccion.getNumero_exterior();
		this.codigo_postal = direccion.getCodigo_postal();
		this.colonia = direccion.getColonia();
		this.ciudad = direccion.getCiudad();
		this.estado = direccion.getEstado();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero_interior() {
		return numero_interior;
	}

	public void setNumero_interior(String numero_interior) {
		this.numero_interior = numero_interior;
	}

	public String getNumero_exterior() {
		return numero_exterior;
	}

	public void setNumero_exterior(String numero_exterior) {
		this.numero_exterior = numero_exterior;
	}

	public Integer getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(Integer codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Integer getCiudad() {
		return ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
