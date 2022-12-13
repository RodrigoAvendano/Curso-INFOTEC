
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) throws Exception {
         // Creo una instancia de GSON
         Gson gson = new Gson();

         // Leo el fichero
         String fichero = "";
 
         try (BufferedReader br = new BufferedReader(new FileReader("list.json"))) {
             String linea;
             while ((linea = br.readLine()) != null) {
                 fichero += linea;
             }
 
         } catch (FileNotFoundException ex) {
             System.out.println(ex.getMessage());
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
 
         // Creo un properties y lo asocio al JSON (solo objeto con propiedades, sin arrays)
         //Archivojson persona = gson.fromJson(fichero, Archivojson.class);
         Person persona = gson.fromJson(fichero, Person.class);
         ArrayList<Archivojson> milista = persona.getAsignaturas();

         for(int x = 0; x<milista.size(); x++) {
            milista.get(x).setNombre(milista.get(x).getNombre()+"-modificado");
            milista.get(x).setTipo(milista.get(x).getTipo()+"-modificado");
            milista.get(x).setPeso(milista.get(x).getPeso()+"-modificado");
            System.out.println(milista.get(x));
         }

        String json1 = gson.toJson(milista);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("list.json"))) {
            bw.write(json1);
            System.out.println("Fichero modificado");
        } catch (IOException ex) {
            System.out.println(ex);
            //Logger.getLogger(LeerJsonEj3.class.getName()).log(Level.SEVERE, null, ex);
        }

        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        String json = gson.toJson(fichero);
        String name = "backup"+dia+"-"+mes+"-"+annio+".json";

         try (BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {
            bw.write(json);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
            System.out.println(ex);
        }
 
        
    }
}
