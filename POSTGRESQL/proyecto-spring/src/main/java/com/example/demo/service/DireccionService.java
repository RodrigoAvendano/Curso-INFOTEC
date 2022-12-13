package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Direccion;
import com.example.demo.repository.DireccionRepository;

@Service
public class DireccionService {
	@Autowired
	private DireccionRepository direccionRepository;
	
	public List<Direccion> listaDireccion(){
        return  direccionRepository.findAll();
    }
	
	public Optional<Direccion> getDireccion(int id){
        return  direccionRepository.findById(id);
    }
	
	public Direccion obtenerPorId(Integer id){
		return this.direccionRepository.findById(id).get();	
	}
	
	public Integer guardarDireccion(String calle, String numero_interior, String numero_exterior, Integer codigo_postal, String colonia, Integer ciudad, Integer estado){
		Direccion direccion = new Direccion();
		direccion.setCalle(calle);
		direccion.setNumero_interior(numero_interior);
		direccion.setNumero_exterior(numero_exterior);
		direccion.setCodigo_postal(codigo_postal);
		direccion.setColonia(colonia);
		direccion.setCiudad(ciudad);
		direccion.setEstado(estado);
		direccion = direccionRepository.save(direccion);
		return direccion.getId();
	}
	
	public boolean existseId(int id){
        return direccionRepository.existsById(id);
    }
	
	public void actualizarDireccion(Direccion direccion) {
		direccionRepository.save(direccion);
	}
	
	public void eliminarDireccion(Integer id) {
		direccionRepository.deleteById(id);		
	}

}
