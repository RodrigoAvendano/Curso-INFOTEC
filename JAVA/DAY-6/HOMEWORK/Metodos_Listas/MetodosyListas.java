import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MetodosyListas {

    String nombre1;
    String nombre2;
    String apellidos;
    int edad;

    public MetodosyListas(){
        this.nombre1 = null;
        this.apellidos = null;
        this.edad = 0;
    }

    public MetodosyListas(String nombre1, String apellidos, int edad) {
        this.nombre1 = nombre1;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public MetodosyListas(String nombre1, String nombre2, String apellidos, int edad) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String primerCadena(String cadena1, String cadena2, int num1, int num2){
        return cadena1+" "+num1+" "+cadena2+" "+num2;
    }

    public String segundaCadena(String cadena1, double d1, double d2){
        return cadena1+" "+d1+" "+d2;
    }

    public List<Integer> primerLista(Integer[] num) {
        List<Integer> lista = Arrays.asList(num);
        return lista;
    }

    public void cambiarValor(List<Integer> lista, int valor, int nuevovalor) {
        try {
            int posicion = lista.indexOf(valor);
            lista.set(posicion, nuevovalor); 
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("El valor "+valor+" no existe en la lista\n");
        }
    }

    public Double sumatoria(List<String> lista) {
        double sumatoria = 0;
        for(int x=0; x<lista.size();x++) {
            sumatoria += Double.parseDouble(lista.get(x));
        }
        return sumatoria;
    }
}
