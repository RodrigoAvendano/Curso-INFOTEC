package com.list.listas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
import java.lang.Math;


@SpringBootApplication
public class ListasApplication {

	public static void main(String[] args) {
		List<Integer> milista = new ArrayList<>();
		int [] num = new int[5];

		for(int x = 0; x<num.length; x++) {
			num[x] = aleatorio(1,1000);
			milista.add(num[x]);
		}

		Collections.sort(milista);    
		System.out.println(milista);
		Collections.reverse(milista);
		System.out.println(milista);

		List<String> letras1 = new ArrayList<>();
		List<String> letras2 = new ArrayList<>();
		letras1.add("A");
		letras1.add("B");
		letras1.add("C");
		letras1.add("D");
		letras1.add("E");
		letras2.add("B");
		letras2.add("D");
		letras2.add("F");
		letras2.add("G");
		letras2.add("H");

		List<String> listamezcla = Stream.concat(letras1.stream(), letras2.stream()).distinct().collect(Collectors.toList());
		System.out.println(listamezcla);
	}

	public static Integer aleatorio(Integer min, Integer max) {
        return (int)(Math.random()*(max - min + 1)+min);
    }

}
