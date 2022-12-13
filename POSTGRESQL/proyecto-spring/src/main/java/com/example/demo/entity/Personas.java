package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Personas", schema="public")
@Entity
public class Personas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="direccion_id")
	private Integer direccion_id;
	
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
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(Integer direccion_id) {
		this.direccion_id = direccion_id;
	}

}
