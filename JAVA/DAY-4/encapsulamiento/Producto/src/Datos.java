public class Datos {

    public static void main(String[] args) {

        Datos misDatos = new Datos();
        misDatos.Info("kg", "Tlalpán");

        Producto misProductos = new Producto(null,true,0,0.0,null);
        misDatos.MiProducto(misProductos);

        System.out.println(misProductos.getNombre());
    }

    static String pieza;
    static boolean rebaja;
    static double descuento;
    static String tienda = "Tech Store";

    public static  Producto MiProducto(Producto objectProd){
        return new Producto(objectProd.getNombre(), objectProd.getDisp(), 
        objectProd.getCantidad(), objectProd.getCosto(), objectProd.getDescripcion());
    }


    public static void Info(String pieza, String tienda) {
        System.out.println(pieza+" disponible(s) en "+tienda);
    }
}
