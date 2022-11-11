public abstract class Persona {

    private String nombre;

    protected Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Boolean trabajando();

    public static void main(String[] args) {
        Persona d = new Doctor("Pedro");
        Persona a = new Abogado("Gema");
        System.out.println(d.trabajando());
        System.out.println(a.trabajando());
    }
}