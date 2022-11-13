import java.util.ArrayList;
import java.util.List;
public class Principal {
    public static void main(String[] args) {
        MetodosyListas user1 = new MetodosyListas("Rodrigo", "Isaac", "Avendaño Ortíz", 24);
        String cadena1 = user1.primerCadena("Día", "Mes", 4, 11);
        System.out.println(cadena1);
        System.out.println(user1.segundaCadena(cadena1, 7.7, 2.2));

        Integer[] newlist = {10,58,68,920,15,16,85,75,32};
        List<Integer> milista = user1.primerLista(newlist);
        System.out.println(milista);
        user1.cambiarValor(milista, 68, 90);
        user1.cambiarValor(milista, 920, 25);
        for(int x=0; x < milista.size();x++) {
            System.out.println(x+": "+milista.get(x));
        }
        List<String> sumas = new ArrayList<>();
        sumas.add("15");
        sumas.add("30");
        sumas.add("12");
        sumas.add("60");
        System.out.println("La suma es de: "+user1.sumatoria(sumas));
        
    }
}
