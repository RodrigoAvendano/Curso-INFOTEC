package com.example.demo.dto;

import com.example.demo.entity.Personas;

public class PersonasDTO {
	
	public Integer id;

	private String nombre;
	
	private String apellidos;
	
	private Integer direccion_id;
	
	public PersonasDTO() {
		
	}
	
	public PersonasDTO(Personas persona) {
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.apellidos = persona.getApellidos();
		this.direccion_id = persona.getDireccion_id();
	}

	public Integer getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(Integer direccion_id) {
		this.direccion_id = direccion_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
