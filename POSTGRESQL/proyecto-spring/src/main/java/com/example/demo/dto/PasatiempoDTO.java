package com.example.demo.dto;

import com.example.demo.entity.Pasatiempo;

public class PasatiempoDTO {
	
	private Integer id;
	
	private String nombre;
	
	private Integer pasatiempo;
	
	private Integer id_persona;
	
	public PasatiempoDTO() {
		
	}
	
	public PasatiempoDTO(Pasatiempo pasatiempo) {
		this.id = pasatiempo.getId();
		this.nombre = pasatiempo.getNombre();
		this.pasatiempo = pasatiempo.getPasatiempo();
		this.id_persona = pasatiempo.getId_persona();
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPasatiempo() {
		return pasatiempo;
	}

	public void setPasatiempo(Integer pasatiempo) {
		this.pasatiempo = pasatiempo;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

}
