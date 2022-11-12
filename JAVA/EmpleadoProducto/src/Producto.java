import java.util.ArrayList;
import java.util.List;

public class Producto {
    String nombre;
    Integer precio;
    Double cantidad;
    List<Integer> tipo = new ArrayList<>();
    Producto(String nombre) {
        this.nombre = nombre;
    }
}
