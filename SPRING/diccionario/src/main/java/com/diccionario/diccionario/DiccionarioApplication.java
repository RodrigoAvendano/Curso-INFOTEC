package com.diccionario.diccionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;
import java.time.format.*;

@SpringBootApplication
public class DiccionarioApplication {

	public static void main(String[] args) {
		Gson gson = new Gson();
        String fichero = "";
        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa palabra");
        String word = sc.nextLine();
        
        Indice palabra = gson.fromJson(fichero, Indice.class);
        ArrayList<Palabra> milista = palabra.getpalabras();

        String espanol = "";
        String english = "";
        String frances = "";
        Boolean existencia = false;
        String newfrench = "";
        String newenglish = "";
        
        for(int x = 0; x<milista.size(); x++) {
            espanol = milista.get(x).getEspanol();
            if(word.equals(espanol)) {
                existencia = true;
                english = milista.get(x).getenglish();
                frances = milista.get(x).getfrances();
                break;
            } 
        }

        if(existencia) {
            System.out.println("Palabra en inglés: "+english);
            System.out.println("Palabra en francés: "+frances);
        } else {
            System.out.println("Esta palabra no existe");
            System.out.println("Ingresa palabra en inglés");
            newenglish = sc.nextLine();
            System.out.println("Ingresa palabra en francés");
            newfrench = sc.nextLine();
            String myjson = fichero.substring(0,fichero.length()-4);
            String newjson = ",{"+
                "\"espanol\":\""+word+"\","+
                "\"english\":\""+newenglish+"\","+
                "\"frances\":\""+newfrench+"\"}]}";
            String json = myjson+newjson;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("diccionario.json"))) {
                bw.write(json);
                System.out.println("Fichero modificado");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("¿Deseas exportar?\n1.SI 2.NO");
        int op = sc.nextInt();  
        if(op == 1) {
            DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime horahora = LocalDateTime.now();
		    String ahora = FOMATTER.format(horahora);
            String idioma = "";
            String newjson = "";
            Boolean estado = false;

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Ingresa idioma");
            String option = sc2.nextLine();
            ArrayList<String> words = new ArrayList<String>();

            option = option.toLowerCase();
            if(option.equals("exportar ingles") || option.equals("exportar inglés")) {
                for(int x = 0; x<milista.size(); x++) {
                    espanol = milista.get(x).getenglish();
                    words.add(espanol);
                }
                if(Boolean.FALSE.equals(existencia)) {
                    words.add(newenglish);
                }
                Collections.sort(words);
                idioma = "ingles";
                newjson = "";
                estado = true;
            }
            if(option.equals("exportar frances") || option.equals("exportar francés")) {
                for(int x = 0; x<milista.size(); x++) {
                    espanol = milista.get(x).getfrances();
                     words.add(espanol);
                }
                if(Boolean.FALSE.equals(existencia)) {
                    words.add(newfrench);
                }
                Collections.sort(words);
                idioma = "frances";
                newjson = "";
                estado = true;
            }
            if(option.equals("exportar espanol") || option.equals("exportar español")) {
                for(int x = 0; x<milista.size(); x++) {
                    espanol = milista.get(x).getEspanol();
                     words.add(espanol);
                }
                if(Boolean.FALSE.equals(existencia)) {
                    words.add(word);
                }
                Collections.sort(words);
                idioma = "espanol";
                newjson = "";
                estado = true;
            }
            if(Boolean.TRUE.equals(estado)) {
                for(int x = 0; x<words.size(); x++) {
                    newjson += words.get(x)+" ";
                }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(idioma+"-"+ahora+".txt"))) {
                    bw.write(newjson);
                    System.out.println("Fichero modificado");
                } catch (IOException ex) {
                    System.out.println(ex);
                } 
            }  
        }
	}

}
