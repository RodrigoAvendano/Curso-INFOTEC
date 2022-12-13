import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
    }
    
}
