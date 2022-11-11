import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList arlTest = new ArrayList();
        System.out.println("Tamaño de array list en la creación: "+arlTest.size());
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");
        System.out.println("Tamaño de array list después de la creación: "+arlTest.size());
        System.out.println("Lista de todos los elementos: "+arlTest);
        arlTest.remove("D");
        System.out.println("Ver contenido después de eliminar un elemento: "+arlTest);
        System.out.println("Tamaño de array list después de eliminar elementos: "+arlTest.size());
        System.out.println(arlTest.contains("K"));
    }
    
}
