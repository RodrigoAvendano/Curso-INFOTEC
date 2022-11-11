public class Ejemplo {

    public static void main(String[] args) {
        Productos servilleta = new Productos("servilleta", 140.00);
        Cliente cliente1 = new Cliente("Juanito", 10.00);
        Tienda tienda = new Tienda("Sonora","Calle Robles #22", servilleta, cliente1);
        System.out.println("Nombre del cliente: "+tienda.getCliente().getNombre());
        System.out.println("Nombre del producto: "+tienda.getProducto().getNombre());
    }
}
