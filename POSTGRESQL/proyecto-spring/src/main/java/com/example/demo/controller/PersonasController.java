package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Mensaje;
import com.example.demo.dto.PersonasDTO;
import com.example.demo.entity.Personas;
import com.example.demo.service.PersonasService;

@RestController
public class PersonasController {
	
	@Autowired
	public PersonasService personaService;
	
	List<String> myList = new ArrayList<>();
	
	
	@PutMapping("/guardarPersonasDTO")
	public ResponseEntity<Integer> guardarPersonas(@RequestBody PersonasDTO data) {
		
		Integer id = 0;
		
		try {
			id = this.personaService.guardarPersona(data.getNombre(), data.getApellidos(), data.getDireccion_id());
		} catch(Exception e) {
			System.out.println("Error");			
		}
		
		if(id == 0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(id,HttpStatus.OK);
	}

	@GetMapping("/obtenerPersonas/{id}")
	public ResponseEntity<PersonasDTO> obtenerPersonas(@PathVariable("id") Integer id){
		Personas persona = this.personaService.obtenerPorId(id);
		PersonasDTO data = new PersonasDTO(persona);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@PutMapping("/actualizarPersonas/{id}")
	public ResponseEntity<?> actualizarPersonas(@PathVariable("id") Integer id, @RequestBody PersonasDTO data){
		Integer flag = 0;
		if(!personaService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		try {
			Personas persona = personaService.getPersonas(id).get();
			persona.setNombre(data.getNombre());
			persona.setApellidos(data.getApellidos());
			persona.setDireccion_id(data.getDireccion_id());
			personaService.actualizarPersonas(persona);
			flag = 1;
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		if(flag == 0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		Mensaje message = new Mensaje("Datos modificados");
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminarPersonas/{id}")
	public ResponseEntity<?> eliminarPersonas(@PathVariable("id") Integer id){
		if(!personaService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		personaService.eliminarPersonas(id);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@GetMapping("/listaPersonas")
	public ResponseEntity<List<Personas>> listaPersonas(){
		List<Personas> persona = personaService.listaPersonas();
		return new ResponseEntity<List<Personas>>(persona, HttpStatus.OK);
	}
	
	@GetMapping("/PDF")
	public ResponseEntity<?> pdfPersonas(){
		List<Personas> persona = personaService.listaPersonas();
		Integer counter = 0;
		String cadenaPersona = "";
		for (Personas personas : persona) {
			cadenaPersona += counter+1+". Nombre: "+personas.getNombre()+". Apellido: "+personas.getApellidos()+". ID: "+personas.getDireccion_id();
			myList.add(cadenaPersona);
			counter++;
			cadenaPersona = "";
		}
		personaService.pdfPersonas(myList);	
		Mensaje message = new Mensaje("PDF exportado");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}


}
