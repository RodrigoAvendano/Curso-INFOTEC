public class Tienda {

    private String nombre;
    private String direccion;
    private Productos producto;
    private Cliente cliente;
    
    public Tienda(String nombre, String direccion, Productos producto, Cliente cliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.producto = producto;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = nombre;
    }

    public Productos getProducto() {
        return this.producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }





}
