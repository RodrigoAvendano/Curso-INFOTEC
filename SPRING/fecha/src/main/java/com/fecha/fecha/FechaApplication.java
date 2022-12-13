package com.fecha.fecha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;
import java.time.format.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;  

@SpringBootApplication
public class FechaApplication {

	public static void main(String[] args) {
		//Create formatter
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String hora = FOMATTER.format(localDateTime);
		System.out.println(hora);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(new Date()));

		LocalDateTime horahora = LocalDateTime.now();
		String ahora = FOMATTER.format(horahora);
		System.out.println(ahora);

		LocalDateTime segunda = LocalDateTime.now().plusHours(5);
		String segundaHora = FOMATTER.format(segunda);
		System.out.println(segundaHora);
		
		LocalDateTime fecha1 = LocalDateTime.parse("2022-12-27T18:14:01.184");
		LocalDateTime fecha2 = LocalDateTime.parse("2022-12-29T09:21:05.184");
		Duration d = Duration.between(fecha1, fecha2);  
		System.out.println("Minutos de diferencia: "+d.toMinutes());
		System.out.println("Horas de diferencia: "+d.toHours());
	}

}
