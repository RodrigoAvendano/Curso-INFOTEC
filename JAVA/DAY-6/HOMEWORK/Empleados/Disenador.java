import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Disenador extends Empleados{

    private String herramienta;
    private int codigo;
    private List<String> actividades = new ArrayList<>();

    public Disenador(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        //TODO Auto-generated constructor stub
        this.setCodigo(8000);
        this.setHerramienta("Photoshop");
    }

    public String getHerramienta() {
        return "Herramienta de Diseño: "+herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setActividades(String actividades) {
        int posicion = this.actividades.indexOf(actividades); 
        if(posicion == -1){
            this.actividades.add(actividades);
        }
    }

    @Override
    public void obtenerActividesDiarias() {
        actividades.add("Reuniones de avance");
        actividades.add("Elaboración de diseño para páginas webs");
        actividades.add("Presentación-ajustes del diseño");
        if(this.getEdad() <= 25) {
            actividades.add("Revisión de diseñador SR");           
        } else {
            actividades.add("Apoyo a diseñador JR"); 
        }
        Collections.sort(actividades);
        
        for(int x=0; x < actividades.size();x++) {
            System.out.println(x+": "+actividades.get(x));
        }
    }

}
