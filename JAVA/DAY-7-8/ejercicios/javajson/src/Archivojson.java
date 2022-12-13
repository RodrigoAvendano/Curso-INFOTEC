public class Archivojson {
    
    private String nombre;
    private String tipo;
    private String peso;

    public Archivojson(String nombre, String tipo, String peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Archivojson{" + "nombre=" + nombre +", tipo=" + tipo + ", peso=" + peso + '}';
    }  
    
}
