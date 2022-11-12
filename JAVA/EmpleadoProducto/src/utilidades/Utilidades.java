package utilidades;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.lang.Math;

public final class Utilidades {

    static int contador = 0;
    public static Integer contar() {
        return contador++;
    }

    /*Método que reciba una lista de productos nos debe indicar cuál es el producto que tiene mayor precio. */
    public static Integer mayor(List<Integer> lista) {
        int maxvalue;
        Collections.sort(lista);
        maxvalue = lista.get(0);
        return maxvalue;
    }

    public static String mayus(String frase) {
        return frase.toUpperCase();
    }

    public static StringBuilder minus(String frase) {
        String newfrase = frase.toLowerCase();
        StringBuilder newString = new StringBuilder();
        newString.append(newfrase);
        newString.reverse();
        return newString;
    }

    public static Integer aleatorio(Integer min, Integer max) {
        int num = (int)(Math.random()*(max - min + 1)+min);
        return num;
    }
}
