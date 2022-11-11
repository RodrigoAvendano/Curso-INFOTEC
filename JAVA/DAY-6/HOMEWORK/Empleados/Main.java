public class Main {
    public static void main(String[] args) {
        

        Programadores programador1 = new Programadores("Javier", "Pérez", 25);
        Disenador disenador1 = new Disenador("Jaime", "Pineda", 27);
        Disenador disenador2 = new Disenador("Raúl", "Pineda", 22);

        System.out.println("Programador: "+programador1.getNombre()+" "+programador1.getEdad()+" años");
        
        System.out.println("Código: "+programador1.getCodigo());
        System.out.println(programador1.getHerramienta());
        System.out.println("Actividades:");
        programador1.obtenerActividesDiarias();

        System.out.println("Diseñador 1: "+disenador1.getNombre()+" "+disenador1.getEdad()+" años");
        System.out.println("Código: "+disenador1.getCodigo());
        System.out.println(disenador1.getHerramienta());
        System.out.println("Actividades:");
        disenador1.obtenerActividesDiarias(); 

        System.out.println("Diseñador 2: "+disenador2.getNombre()+" "+disenador2.getEdad()+" años");
        System.out.println("Código: "+disenador2.getCodigo());
        System.out.println(disenador2.getHerramienta());
        System.out.println("Actividades:");
        disenador2.obtenerActividesDiarias();
    }
}
