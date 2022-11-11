public class Main {

    public static void main(String[] args) {

        Producto clase11 = new Producto("Manzanas",true,8,17.50,"Golden");
        Producto clase12 = new Producto("Pilas",false,0,37.50,"AAA");
        
        Datos clase21 = new Datos();
        Datos clase22 = new Datos();

        //Realizar comparación de las instancias de la misma Clase utilizando las distintas formas de comparar objetos.

        if(clase11.equals(clase12)) {
            System.out.println("Las clases de Producto son iguales");
        } else {
            System.out.println("Las clases de Producto no son iguales");
        }

        if(clase21.equals(clase22)) {
            System.out.println("Las clases de Datos son iguales");
        } else {
            System.out.println("Las clases de Datos no son iguales");
        }

        /*Realiza un procedimiento que compare cada uno de los atributos de la CLASE1 con otro Objeto del 
        mismo tipo, de la forma y en donde creas que sea más limpio y reutilizable. */
        if(clase11.hashCode() == clase12.hashCode()) {
            System.out.println("Producto: "+clase11.hashCode());
        }else {
            System.out.println("Clase Producto 1:"+clase11.hashCode());
            System.out.println("Clase Producto 2:"+clase12.hashCode());
        }

        if(clase21.hashCode() == clase22.hashCode()) {
            System.out.println("Datos: "+clase11.hashCode());
        }else {
            System.out.println("Clase Datos 1:"+clase21.hashCode());
            System.out.println("Clase Datos 2:"+clase22.hashCode());
        }

        //Logra que el HASHCODE de 2 instancias de la misma Clase sean iguales.

        Producto clase13 = clase11;

        if(clase11.hashCode() == clase13.hashCode()) {
            System.out.println("Productos con mismo hash: "+clase11.hashCode());
        }else {
            System.out.println("Clase Producto 1:"+clase11.hashCode());
            System.out.println("Clase Producto 3:"+clase13.hashCode());
        }

        //Utiliza cualquier método de la CLASE2 de las dos formas de acceso distintas
        clase21.Info("unidad", "Insurgentes");
        Datos.Info("caja", "Tepotzotlán");
        

    }

}