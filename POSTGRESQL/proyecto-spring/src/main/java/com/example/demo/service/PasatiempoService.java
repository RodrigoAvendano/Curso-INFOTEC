package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pasatiempo;
import com.example.demo.repository.PasatiempoRepository;

@Service
public class PasatiempoService {
	@Autowired
	private PasatiempoRepository pasatiempoRepository;
	
	public List<Pasatiempo> listaPasatiempo(){
        return  pasatiempoRepository.findAll();
    }
	
	public Optional<Pasatiempo> getPasatiempo(int id){
        return  pasatiempoRepository.findById(id);
    }
	
	public Pasatiempo obtenerPorId(Integer id) {
		return this.pasatiempoRepository.findById(id).get();	
	}
	
	public Integer guardarPasatiempo(String nombre, Integer pasatiempo, Integer id_persona) {
		Pasatiempo pasatiempos = new Pasatiempo();
		pasatiempos.setNombre(nombre);
		pasatiempos.setPasatiempo(pasatiempo);
		pasatiempos.setId_persona(id_persona);
		pasatiempos = pasatiempoRepository.save(pasatiempos);
		return pasatiempos.getId();
	}	
	
	public boolean existseId(int id){
        return pasatiempoRepository.existsById(id);
    }
	
	public void actualizarPasatiempo(Pasatiempo pasatiempo) {
		pasatiempoRepository.save(pasatiempo);
	}
	
	public void eliminarPasatiempo(Integer id) {
		pasatiempoRepository.deleteById(id);		
	}
}
