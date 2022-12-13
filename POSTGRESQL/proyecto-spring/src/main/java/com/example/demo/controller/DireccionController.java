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

import com.example.demo.dto.DireccionDTO;
import com.example.demo.dto.Mensaje;
import com.example.demo.entity.Direccion;
import com.example.demo.service.DireccionService;

@RestController
public class DireccionController {
	
	@Autowired
	public DireccionService direccionService;
	
	@PutMapping("/guardarDireccionDTO")
	public ResponseEntity<Integer> guardarDireccion(@RequestBody DireccionDTO data) {
		
		Integer id = 0;
		
		try {
			id = this.direccionService.guardarDireccion(data.getCalle(), data.getNumero_interior(), data.getNumero_exterior(), data.getCodigo_postal(), data.getColonia(), data.getCiudad(), data.getEstado());
		} catch(Exception e) {
			System.out.println("Error");
		}
		
		if(id == 0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	@GetMapping("/obtenerDirecciones/{id}")
	public ResponseEntity<DireccionDTO> obtenerDireccion(@PathVariable("id") Integer id){
		Direccion direccion = this.direccionService.obtenerPorId(id);
		DireccionDTO data = new DireccionDTO(direccion);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	
	@PutMapping("/actualizarDireccion/{id}")
	public ResponseEntity<?> actualizarDireccion(@PathVariable("id") Integer id, @RequestBody DireccionDTO data){
		Integer flag = 0;
		if(!direccionService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		try {
			Direccion direccion = direccionService.getDireccion(id).get();
			direccion.setCalle(data.getCalle());
			direccion.setCiudad(data.getCiudad());
			direccion.setCodigo_postal(data.getCodigo_postal());
			direccion.setColonia(data.getColonia());
			direccion.setEstado(data.getEstado());
			direccion.setNumero_exterior(data.getNumero_exterior());
			direccion.setNumero_interior(data.getNumero_interior());
			direccionService.actualizarDireccion(direccion);
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
					
	@DeleteMapping("/eliminarDirecciones/{id}")
	public ResponseEntity<?> eliminarDirecciones(@PathVariable("id") Integer id){
		if(!direccionService.existseId(id)) {
			Mensaje message = new Mensaje("No existe el id a eliminar");
			return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
		direccionService.eliminarDireccion(id);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}

	
	 @GetMapping("/listaDireccion")
	public ResponseEntity<List<Direccion>> listaTorres(){
		List<Direccion> direccion = direccionService.listaDireccion();
		return new ResponseEntity<List<Direccion>>(direccion, HttpStatus.OK);
	}
}
