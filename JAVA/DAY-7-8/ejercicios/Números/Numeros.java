import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Numeros {
    Numeros(List<Double> numbers) {
        System.out.println("El número más grande "+Collections.max(numbers));
        System.out.println("El número más grande "+Collections.min(numbers));
        Double sumaTotal = 0.0;
        Double sumaPositivos = 0.0;
        Double sumaNegativos = 0.0;
        List<Double> primos = new ArrayList<>();
        for(Double milista : numbers) {
            sumaTotal += milista;
            if(milista < 0) {
                sumaNegativos+=milista;
            } else if(milista > 0) {
                sumaPositivos+=milista;
            }
        }
        System.out.println("La suma de todos los números es "+sumaTotal);
        System.out.println("La suma de todos los números positivos es "+sumaPositivos);
        System.out.println("La suma de todos los números negativos es "+sumaNegativos);
        System.out.println("No existen números primos negativos");
    }
}
