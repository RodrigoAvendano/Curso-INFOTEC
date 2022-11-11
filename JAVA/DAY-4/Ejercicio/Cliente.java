public class Cliente {

    private String nombre;
    private Double cantidadDinero;
    
    public Cliente(String nombre, Double cantidadDinero) {
        this.nombre = nombre;
        this.cantidadDinero = cantidadDinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(Double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }
}
