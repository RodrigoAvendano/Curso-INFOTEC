import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;

public final class Utilidades {

    static int contador = 0;
    public static Integer contar() {
        return contador;
    }

    /*Método que reciba una lista de productos nos debe indicar cuál es el producto que tiene mayor precio. */
    public static void mayorPrecio(List<Producto> lista) {
        contador++;
        int aux = 0;
        int newnum = 0;
        int posicion = 0;
        int x;
        for(x = 0; x<lista.size(); x++) {
            aux = lista.get(x).getPrecio();
            if(x == 0) {
                newnum = aux;
                posicion = x;
            }
            if(newnum <= aux) {
                newnum = lista.get(x).getPrecio();
                posicion = x;
            }
        }
        System.out.println("El precio más alto es de "+newnum+" del producto: "+lista.get(posicion).getNombre());
        
    }

    public static void mayorCantidad(List<Producto> lista) {
        contador++;
        int aux = 0;
        int newnum = 0;
        int posicion = 0;
        int x;
        for(x = 0; x<lista.size(); x++) {
            aux = lista.get(x).getCantidad();
            if(x == 0) {
                newnum = aux;
                posicion = x;
            }
            if(newnum <= aux) {
                newnum = lista.get(x).getCantidad();
                posicion = x;
            }
        }
        System.out.println("La cantidad más alta es de "+newnum+" del producto: "+lista.get(posicion).getNombre());
    }

    public static void costo(List<Producto> lista) {
        contador++;
        List<Integer> listacostos = new ArrayList<>();
        for(Producto costos :lista){
            listacostos.add(costos.getPrecio()*costos.getCantidad());
        }
        for(int x = 0; x<listacostos.size(); x++) {
            System.out.println("El costo de "+lista.get(x).getNombre()+" es $"+listacostos.get(x));
        }
        
    }

    public static void datosProductos(List<Producto> lista) {
        contador++;
        System.out.println("\n****Datos Generales****");
        for(Producto datos :lista){
            if(datos.getCantidad() == 0) {
                System.out.println(datos.getNombre()+" tiene "+datos.getCantidad()+" producto en inventario");
            }
        }
        mayorPrecio(lista);
        mayorCantidad(lista);
        costo(lista);
    }

    public static void despedirUsuario(List<Empleado> lista) {
        contador++;
        for(int x = 0; x<lista.size(); x++) {
            if(lista.get(x).getTipo() == 3){
                System.out.println("Empleado : "+lista.get(x).getNombre()+" fue despedido");
                lista.set(x,null);
            }
        }
        System.out.println("Empleados restantes:");
        try {
            for(Empleado empleado :lista){
                System.out.println(empleado.getNombre());
            }
            
        } catch(NullPointerException e ){
            
        }
        
    }
    
    public static void horactual() {
        contador++;
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hora actual: " + hora+" hrs");
    }

    public static String mayus(String frase) {
        contador++;
        return frase.toUpperCase();
    }

    public static StringBuilder minus(String frase) {
        contador++;
        String newfrase = frase.toLowerCase();
        StringBuilder newString = new StringBuilder();
        newString.append(newfrase);
        newString.reverse();
        return newString;
    }

    public static Integer aleatorio(Integer min, Integer max) {
        int num = (int)(Math.random()*(max - min + 1)+min);
        return num;
    }
}
