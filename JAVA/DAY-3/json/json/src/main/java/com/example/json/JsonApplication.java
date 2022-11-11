package com.example.json;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) {

		String jsonfinal = "";
		Gson gson = new Gson();

		try {
			BufferedReader br = new BufferedReader(new FileReader("prueba.json"));
			String linea;
			try {
				while((linea = br.readLine()) != null){
					jsonfinal+=linea;
				} 
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		PersonaDTO datos = gson.fromJson(jsonfinal, PersonaDTO.class);
		String jsonJava = gson.toJson(datos);
		System.out.println("Resultado: "+jsonfinal);
	}

}
