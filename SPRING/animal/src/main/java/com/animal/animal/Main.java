package com.animal.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.time.*;
import java.time.format.*;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
		String hora;
		String especie;
		List<Animal> milista = new ArrayList<>();
		Integer lion = 0;
		Integer cat = 0;
		Integer dog = 0;
		Integer deer = 0;
		Integer eleph = 0;
		
		for(int x = 1; x<=10000; x++) {
			Animal animal = new Animal(x+1,Asignar());
			milista.add(animal);
			if(x%1000 == 0) {
				LocalDateTime localDateTime = LocalDateTime.now();
				hora = FOMATTER.format(localDateTime);
				System.out.println(animal.getAnimal()+"->"+x);
				System.out.println("Esperando "+hora);
				try {
					Thread.sleep(2*1000);
				 } catch (Exception e) {
					System.out.println(e);
				 }

			}
			if(animal.getAnimal().equals("León")) {
				lion++;
			}
			if(animal.getAnimal().equals("Gato")) {
				cat++;
			}
			if(animal.getAnimal().equals("Perro")) {
				dog++;
			}
			if(animal.getAnimal().equals("Venado")) {
				deer++;
			}
			if(animal.getAnimal().equals("Elefante")) {
				eleph++;
			}
		}
		System.out.println("Resumen: hay "+lion+" Leones, "+cat+" Gatos, "+dog+" Perros, "+deer+" Venados y "+eleph+" Elefantes ");
		
	}

	public static Tipo Asignar() {
		Integer num = aleatorio(1,5);
		Tipo especie;
		if(num == 1) {
			especie = Tipo.ELEFANTE;
		}  else if(num == 2) {
			especie = Tipo.GATO;
		} else if(num == 3) {
			especie = Tipo.LEON;
		} else if(num == 4){
			especie = Tipo.PERRO;
		} else {
			especie = Tipo.VENADO;
		}
		return especie;
	}

	public static Integer aleatorio(Integer min, Integer max) {
        int num = (int)(Math.random()*(max - min + 1)+min);
        return num;
    }

}
