import java.util.ArrayList;
import utilidades.Utilidades;

public class Producto {
    private String nombre;
    private Integer precio;
    private Integer cantidad;
    private ArrayList<String> tipo = new ArrayList<>();
    static private ArrayList<Boolean> status = new ArrayList<>();
    private String productType;
    private Boolean flag = false;

    Producto(String nombre) {
        this.nombre = nombre;
        this.precio = Utilidades.aleatorio(300,500);
        this.cantidad = Utilidades.aleatorio(10,15);
        this.productType = selectTipo();
    }
    public String getNombre() {
        return nombre;
    }
    public void 
    Nombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void listado() {
        if(!flag) {
            tipo.add("Consumo");
            //tipo.add("Servicio");
            /*  tipo.add("Uso común");
            tipo.add("Emergencia");
            tipo.add("Durable");
            tipo.add("Especialidad");
            tipo.add("Electrónica");
            tipo.add("Enlatado");
            tipo.add("Entretenimiento");
            tipo.add("Marca de fruta");
            tipo.add("Marca de verdura");
            tipo.add("Embolsado");
            tipo.add("Producto Suelto");
            tipo.add("Ornamentación");
            tipo.add("Perecedero");
            tipo.add("No perecedero");
            tipo.add("Inflamable");
            tipo.add("De colección");
            tipo.add("Químico");
            tipo.add("Envasado en vidrio"); */
            for(int x = 1; x <= tipo.size(); x++) {
                status.add(true);
            }
            flag = true;
        }
    } 

    private String selectTipo() {
        listado();
        int posicion = status.indexOf(true);//0
        try {
            System.out.println("POSICION --> "+posicion+"\n");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("FAILURE POSITION "+e);
        }
        Integer num = Utilidades.aleatorio(1,2)-1;
        if(posicion >= 0){
            while(Boolean.FALSE.equals(status.get(num))) {
                num = Utilidades.aleatorio(1,2)-1;
            }
        }
        if(posicion < 0) {
            try {
                System.out.println("----0---"+status.get(num-1)+"NUM "+num+" "+status.get(0));
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("WARNING "+e);
            }
            return "Se han seleccionado todos los tipos disponible";
        } else {
            status.set(num, false);//1,2
            try {
                System.out.println("----1---"+status.get(num-1)+"NUM "+num+" "+status.get(0));
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("WARNING");
            }
            return tipo.get(num);
        }
    }

    public String getTipo() {
        return productType;
    }
}
