package com.example.demo.controller;

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
import com.example.demo.dto.PasatiempoDTO;
import com.example.demo.entity.Pasatiempo;
import com.example.demo.service.PasatiempoService;

@RestController
public class PasatiempoController {
	
	@Autowired
	public PasatiempoService pasatiempoService;
	
	@PutMapping("/guardarPasatiempoDTO")
	public ResponseEntity<Integer> guardarPasatiempo(@RequestBody PasatiempoDTO data) {
		
		Integer id = 0;
		
		try {
			id = this.pasatiempoService.guardarPasatiempo(data.getNombre(), data.getPasatiempo(), data.getId_persona());
		} catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
		if(id == 0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@GetMapping("/obtenerPasatiempo/{id}")
	public ResponseEntity<PasatiempoDTO> obtenerPasatiempo(@PathVariable("id") Integer id){
		Pasatiempo pasatiempo = this.pasatiempoService.obtenerPorId(id);
		PasatiempoDTO data = new PasatiempoDTO(pasatiempo);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@PutMapping("/actualizarPasatiempos/{id}")
	public ResponseEntity<?> actualizarPasatiempos(@PathVariable("id") Integer id, @RequestBody PasatiempoDTO data){
		Integer flag = 0;
		if(!pasatiempoService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		try {
			Pasatiempo pasatiempo = pasatiempoService.getPasatiempo(id).get();
			pasatiempo.setNombre(data.getNombre());
			pasatiempo.setPasatiempo(data.getPasatiempo());
			pasatiempo.setId_persona(data.getId_persona());
			pasatiempoService.actualizarPasatiempo(pasatiempo);
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
	
	@DeleteMapping("/eliminarPasatiempo/{id}")
	public ResponseEntity<?> eliminarPasatiempo(@PathVariable("id") Integer id){
		if(!pasatiempoService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		pasatiempoService.eliminarPasatiempo(id);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	 @GetMapping("/listaPasatiempo")
		public ResponseEntity<List<Pasatiempo>> listaPasatiempo(){
			List<Pasatiempo> pasatiempo = pasatiempoService.listaPasatiempo();
			return new ResponseEntity<List<Pasatiempo>>(pasatiempo, HttpStatus.OK);
	 	}

}
