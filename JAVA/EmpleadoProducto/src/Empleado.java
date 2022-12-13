public class Empleado implements RecibirPago {

    private String nombre;
    private Integer edad;
    private String antiguedad;
    private Integer tipo;

    Empleado(String nombre, Integer edad, String antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = Utilidades.aleatorio(1,3);
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
        if(getTipo() == 1 || getTipo() == 2) {
            System.out.println("Tienes permitido vender productos");
        } else {
            System.out.println("No tienes permitido vender productos");
        }
    }

    public void acomodarProductos() {
        if(tipo == 1){
            System.out.println("Tienes permitido acomodar productos");
        } else {
            System.out.println("No tienes permitido acomodar productos");
        }
    }

    public void  descansar() {
        if(tipo == 1 || tipo == 2){
            System.out.println("Tienes permitido descansar");
        } else {
            System.out.println("No tienes permitido descansar");
        }
    }

    public void sentarse() {
        if(tipo == 1){
            System.out.println("Tienes permitido sentarte");
        } else {
            System.out.println("No tienes permitido sentarte");
        }
    }

    public void correr() {
        if(tipo == 2){
            System.out.println("Tienes permitido correr");
        } else {
            System.out.println("No Tienes permitido correr");
        }
    }

    public void recibirpago(int monto) {
        System.out.println("El pago recibido es de "+monto);
    }
}
