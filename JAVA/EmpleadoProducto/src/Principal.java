import utilidades.Utilidades;
public class Principal {

    public static void main(String[] args) throws Exception {
        //Producto
        Producto producto1 = new Producto("Nido");
        Producto producto2 = new Producto("La Costeña");
        
        System.out.println(producto1.getNombre()+"\n"+producto1.getPrecio()+"\n"+producto1.getCantidad());
        System.out.println("**->"+producto1.getTipo());
        System.out.println(producto2.getNombre()+"\n"+producto2.getPrecio()+"\n"+producto2.getCantidad());
        System.out.println("**->"+producto2.getTipo());
        
        String cadena = "Hola Mundo";
        System.out.println(Utilidades.mayus(cadena));
        System.out.println(Utilidades.minus(cadena));
        Utilidades.horactual();
    }
}
