package com.enumeradores.peliculavideojuego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeliculavideojuegoApplication {

	public static void main(String[] args) {
		Pelicula arrayPelicula[]=new Pelicula[5];
        
        arrayPelicula[0] = new Pelicula("Avengers",140,true, Genero.ACCION,"Hermanos Russo");
        arrayPelicula[1] = new Pelicula("Jurassic Park","Steven Spielberg");
        arrayPelicula[2] = new Pelicula("IT", 135, Genero.TERROR, "Andrés Muschietti");
        arrayPelicula[3] = new Pelicula("Un lugar en silencio", 90, true, Genero.TERROR, "John Krasinski");
        arrayPelicula[4] = new Pelicula("Extraordinario","Stephen Chbosky");
        arrayPelicula[1].activar();
        arrayPelicula[2].activar();

		Videojuego arrayVideojuego[]=new Videojuego[5];  
        arrayVideojuego[0] = new Videojuego("Persona 5", 100, true, Gender.AVENTURA, Compania.ATLUS)   ;
        arrayVideojuego[1] = new Videojuego("Pokemon Sword",60);
        arrayVideojuego[2] = new Videojuego("Monster Hunter Rise", 120, Gender.AVENTURA, Compania.CAPCOM);
        arrayVideojuego[3] = new Videojuego("Fire Emblem: Three Houses", 100, true, Gender.ESTRATEGIA, Compania.INTELLIGENTSYS);
        arrayVideojuego[4] = new Videojuego("Stray",10);
        arrayVideojuego[4].activar();
        arrayVideojuego[2].activar();

		for(int x = 0; x<arrayPelicula.length; x++) {
			System.out.println(arrayPelicula[x].toString());
		}
		System.out.println("\n");
		for(int x = 0; x<arrayVideojuego.length; x++) {
			System.out.println(arrayVideojuego[x].toString());
		}
	}

}
