import java.rmi.activation.ActivationGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Programadores extends Empleados {

    private String herramienta;
    private int codigo;
    private List<String> actividades = new ArrayList<>();

    public Programadores(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        //TODO Auto-generated constructor stub
        this.setCodigo(9000);
        this.setHerramienta("Eclipse");
    }

    public String getHerramienta() {
        return "Herramienta de Desarrollo: "+herramienta;
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
        String act;
        actividades.add("Análisis de requerimientos");
        actividades.add("Desarrollo de requerimientos");
        actividades.add("Presentación-pruebas unitarias");
        Collections.reverse(actividades);
        for(int x=0; x < actividades.size();x++) {
            act = actividades.get(x);
            System.out.println(x+": "+act.substring(1, act.length() - 1));
        }
    }
}
