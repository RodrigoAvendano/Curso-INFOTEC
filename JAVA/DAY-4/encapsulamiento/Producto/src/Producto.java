public class Producto {

    public static void main(String[] args) {

        Producto miProducto = new Producto("Manzanas",true,8,17.50,"Golden");
        System.out.println(miProducto.DatosProducto());
    }

    private String nombre;
    private boolean disponibilidad;
    private int cantidad;
    private double costo;
    private String descripcion;

    public Producto(String nombre, boolean disponibilidad, int cantidad, double costo, String descripcion) {

        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this. cantidad = cantidad;
        this.costo = costo;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return nombre;
    }

    public boolean getDisp() {
        return disponibilidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String DatosProducto() {
        String disponible = "Disponibles";
        if (!disponibilidad) {
            disponible = "No disponibles";
        }
        return "Producto: "+nombre+" ."+disponible+": "+cantidad+"  a $"+costo;
    }

}
