package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona",schema="public")
public class Persona {
	
	private Integer id;
	
	private String nombre;
	
	private String apellidos;
	
}
