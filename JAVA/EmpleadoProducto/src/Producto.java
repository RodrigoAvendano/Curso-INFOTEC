import java.util.ArrayList;

public class Producto {
    private String nombre;
    private String productType;
    private Integer precio;
    private Integer cantidad;
    private static ArrayList<String> tipo = new ArrayList<>();
    private static ArrayList<Boolean> status = new ArrayList<>();
    private static Boolean flag = false;
    private static Boolean estadoLista = true;

    Producto(String nombre) {
        this.productType = selectTipo();
        if(Boolean.TRUE.equals(estadoLista)) {
            this.nombre = nombre;
            this.precio = Utilidades.aleatorio(300,500);
            this.cantidad = Utilidades.aleatorio(10,15);
        } else {
            this.nombre = nombre;
            this.precio = 0;
            this.cantidad = 0;
        }
        
    }
    public String getNombre() {
        return nombre;
    }
    public void nombre(String nombre) {
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
    public static void listado() {
        if(Boolean.FALSE.equals(flag)) {
            tipo.add("Consumo");
            tipo.add("Servicio");
            tipo.add("Uso común");
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
            tipo.add("Envasado en vidrio");
            for(int x = 0; x < tipo.size(); x++) {
                status.add(true);
            }
            flag = true;
        }
    } 

    private static String selectTipo() {
        listado();
        int posicion = status.indexOf(true);//0
        Integer num = Utilidades.aleatorio(1,20)-1;
        if(posicion >= 0){
            while(Boolean.FALSE.equals(status.get(num))) {
                num = Utilidades.aleatorio(1,20)-1;
            }
            status.set(num, false);
            return tipo.get(num);
        } else {
            estadoLista = false;
            return "Se han seleccionado todos los tipos disponibles";
        }
    }

    public String getTipo() {
        return productType; 
    }

    public String venta(Empleado empleado){
        if(empleado.getTipo() == 1 || empleado.getTipo() == 2){
            if(this.cantidad > 0) {
                this.cantidad=this.cantidad-1;
                return "Empleado tipo "+empleado.getTipo()+" vendió 1 "+nombre+"\nQuedán "+cantidad+" disponible(s)\n";
            } else{
                return "Este producto esta agotado\n";
            }
        } else {
            return "Empleado tipo "+empleado.getTipo()+": No tienes autorización para vender productos\n";
        }     
    }
}
