import java.util.List;
import java.util.ArrayList;
public class Principal {

    public static void main(String[] args) throws Exception {
        //Producto
        Producto producto1 = new Producto("Nido");
        Producto producto2 = new Producto("La Costeña");
        Producto producto3 = new Producto("La Sierra");
        Empleado empleado1 = new Empleado("Daniel", 29, "9 meses");
        Empleado empleado2 = new Empleado("Ramón", 34, "2 años");
        Empleado empleado3 = new Empleado("María", 21, "6 meses");

        System.out.println("--------- EMPLEADOS ---------");

        System.out.println("Nombre del empleado: "+empleado1.getNombre()+"\nEdad: "+empleado1.getEdad()+"\nTipo: "+empleado1.getTipo()+
        "\nAntiguedad: "+empleado1.getAntiguedad()+"\n");
        empleado1.venderProductos();
        empleado1.acomodarProductos();
        empleado1.descansar();
        empleado1.sentarse();
        empleado1.correr();

        System.out.println("\nNombre del empleado: "+empleado2.getNombre()+"\nEdad: "+empleado2.getEdad()+"\nTipo: "+empleado2.getTipo()+
        "\nAntiguedad: "+empleado2.getAntiguedad()+"\n");
        empleado2.venderProductos();
        empleado2.acomodarProductos();
        empleado2.descansar();
        empleado2.sentarse();
        empleado2.correr();

        System.out.println("\nNombre del empleado: "+empleado3.getNombre()+"\nEdad: "+empleado3.getEdad()+"\nTipo: "+empleado3.getTipo()+
        "\nAntiguedad: "+empleado3.getAntiguedad()+"\n");
        empleado3.venderProductos();
        empleado3.acomodarProductos();
        empleado3.descansar();
        empleado3.sentarse();
        empleado3.correr();

        System.out.println("--------- PRODUCTOS ---------");


        System.out.println("\nNombre del Producto: "+producto1.getNombre()+"\nPrecio: "+producto1.getPrecio()+"\nCantidad: "+producto1.getCantidad());
        System.out.println("Tipo de Producto: "+producto1.getTipo()+"\n");
        

        System.out.println("Nombre del Producto: "+producto2.getNombre()+"\nPrecio: "+producto2.getPrecio()+"\nCantidad: "+producto2.getCantidad());
        System.out.println("Tipo de Producto: "+producto2.getTipo()+"\n");

        System.out.println("Nombre del Producto: "+producto3.getNombre()+"\nPrecio: "+producto3.getPrecio()+"\nCantidad: "+producto3.getCantidad());
        System.out.println("Tipo de Producto: "+producto3.getTipo()+"\n");

        System.out.println("--------VENTAS ---------");
        for(int x = 0; x<21; x++) {
            System.out.println(producto1.venta(empleado1));
        }
        System.out.println(producto1.venta(empleado1));
        System.out.println(producto1.venta(empleado2));
        System.out.println(producto1.venta(empleado3));
        System.out.println(producto2.venta(empleado1));
        System.out.println(producto2.venta(empleado2));
        System.out.println(producto3.venta(empleado3));

        System.out.println("--------- UTILERIA ---------");
        //Listas
        List<Producto> milista = new ArrayList<>();
        milista.add(producto1);
        milista.add(producto2);
        milista.add(producto3);

        Utilidades.mayorPrecio(milista);  
        Utilidades.mayorCantidad(milista);  
        Utilidades.costo(milista);
        Utilidades.datosProductos(milista);  

        List<Empleado> milista2 = new ArrayList<>();
        milista2.add(empleado1);
        milista2.add(empleado2);
        milista2.add(empleado3);
        Utilidades.despedirUsuario(milista2);

        String cadena = "Hola Mundo";
        System.out.println("Cadena en mayúsculas: "+Utilidades.mayus(cadena));
        System.out.println("Cadena en minúsculas: "+Utilidades.minus(cadena));
        Utilidades.horactual();
        System.out.println(Utilidades.contar());
        
    }
}
