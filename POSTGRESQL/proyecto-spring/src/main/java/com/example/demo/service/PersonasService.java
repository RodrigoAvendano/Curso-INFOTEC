package com.example.demo.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Personas;
import com.example.demo.repository.PersonasRepository;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

@Service
public class PersonasService {
	
	@Autowired
	private PersonasRepository personasRepository;
	
	public List<Personas> listaPersonas(){
        return  personasRepository.findAll();
    }
	
	public Optional<Personas> getPersonas(int id){
        return  personasRepository.findById(id);
    }
	
	public Personas obtenerPorId(Integer id) {
		return this.personasRepository.findById(id).get();
	}
	
	public Integer guardarPersona(String nombre, String apellidos, Integer direccion_id) {
		Personas persona = new Personas();
		persona.setNombre(nombre);
		persona.setApellidos(apellidos);
		persona.setDireccion_id(direccion_id);
		persona = personasRepository.save(persona);
		return persona.getId();
	}
	
	public boolean existseId(int id){
        return personasRepository.existsById(id);
    }
	
	public void actualizarPersonas(Personas persona) {
		personasRepository.save(persona);
	}
	
	public void eliminarPersonas(Integer id) {
		personasRepository.deleteById(id);		
	}
	
	public void pdfPersonas(List<String> personas) {
		String filepath = "C:\\Users\\Rodrigo\\Desktop\\pdfFiles\\personas.pdf";
		try {
			PdfWriter writer = new PdfWriter(filepath);
			PdfDocument pdfdoc = new PdfDocument(writer);
			pdfdoc.addNewPage();
			Document document = new Document(pdfdoc);
			
			for (String persona : personas) {
				Paragraph paragraphHello = new Paragraph();
				paragraphHello.add(persona);
				document.add(paragraphHello);
			}
            
			document.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
