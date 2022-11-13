import utilidades.Utilidades;
public class Principal {

    public static void main(String[] args) throws Exception {
        //Producto
        Producto producto1 = new Producto("Nido");
        Producto producto2 = new Producto("La Costeña");
        Producto producto3 = new Producto("La Sierra");


        System.out.println("Nombre del Producto: "+producto1.getNombre()+"\nPrecio: "+producto1.getPrecio()+"\nCantidad: "+producto1.getCantidad());
        System.out.println("Tipo de Producto: "+producto1.getTipo()+"\n");
        System.out.println("Nombre del Producto: "+producto2.getNombre()+"\nPrecio: "+producto2.getPrecio()+"\nCantidad: "+producto2.getCantidad());
        System.out.println("Tipo de Producto: "+producto2.getTipo()+"\n");
        System.out.println("Nombre del Producto: "+producto3.getNombre()+"\nPrecio: "+producto3.getPrecio()+"\nCantidad: "+producto3.getCantidad());
        System.out.println("Tipo de Producto: "+producto3.getTipo()+"\n");
        
        String cadena = "Hola Mundo";
        System.out.println(Utilidades.mayus(cadena));
        System.out.println(Utilidades.minus(cadena));
        Utilidades.horactual();
    }
}
