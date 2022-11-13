public class Empleado implements RecibirPago {

    private String nombre;
    private Integer edad;
    private String antiguedad;
    private Integer tipo;

    Empleado(String nombre, Integer edad, String antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void venderProductos() {
        if(tipo == 1){
            System.out.println("Vendes productos");
        }
    }

    public void acomodarProductos() {
        if(tipo == 1 || tipo == 2){
            System.out.println("Acomodas productos");
        }
    }

    public void  descansar() {
        if(tipo == 1 || tipo == 2){
            System.out.println("Descansas");
        }
    }

    public void sentarse() {
        if(tipo == 1){
            System.out.println("Puedes sentarte");
        }
    }

    public void correr() {
        if(tipo == 2){
            sout("Tienes autorización para correr");
        }
    }

    public void recibirpago(int monto) {
        System.out.println("El pago recibido es de "+monto);
    }
}
