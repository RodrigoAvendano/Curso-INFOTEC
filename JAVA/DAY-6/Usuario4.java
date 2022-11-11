public class Usuario4 {
    String nombre ;
    int edad;
    String direccion;
    //El constructor de la clase Usuario4 esta sobrecargado
    public Usuario4(){
        nombre = null;
        edad = 0;
        direccion = null;
    }
    public Usuario4(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    public Usuario4(Usuario4 usr) {
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    //El método set esta sobrecargado
    public void setEdad(float edad) {
        this.edad = (int)edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

class ProgUsuarioEjemplo {
    void imprimeUsuario(Usuario4 usr) {
        System.out.println("\nNombre: "+usr.nombre);
        System.out.println("Edad: "+usr.getEdad());
        System.out.println("Dirección: "+usr.getDireccion()+"\n");
    }
    public static void main(String[] args) {
        ProgUsuarioEjemplo prog = new ProgUsuarioEjemplo();
        //Se declaran dos objetos de la clase usuario4
        Usuario4 usr1, usr2;
        /*Se utiliza el constructor por omisión*/
        usr1 = new Usuario4();      
        prog.imprimeUsuario(usr1);  
        /*Se utiliza el segundo constructor de usuario4*/
        usr2 = new Usuario4("Eduardo", 24, "Mi dirección");
        prog.imprimeUsuario(usr2);
        //Se utiliza el tercer constructor de Usuario4
        usr1 = new Usuario4(usr2);
        usr1.setEdad(50);
        usr2.setEdad(30.45f);
        prog.imprimeUsuario(usr1);
        prog.imprimeUsuario(usr2);
    }
}
