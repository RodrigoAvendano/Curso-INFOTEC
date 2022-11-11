import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        //1. Generar un arreglo con los siguientes valores [14,33,21,45,1], obtener valor mayor y valor menor e imprimirlos en consola
        int[] array1 = {14,33,21,45,1};

        Arrays.sort(array1);

        System.out.println("El valor menor es "+array1[0]+" y el mayor es "+array1[array1.length-1]);

        /*2. Genera un arreglo con las siguientes cadenas de texto "Hola mundo", "Hola java" y "Hola curso", obtener el segundo 
        elemento del arreglo y generar un arreglo que contenga cada carácter de la cadena de texto
        */

        String[] array2 = {"Hola mundo", "Hola java", "Hola curso"};
        char[] arrayletras = new char[array2[1].length()];
        
        for(int x=0; x < arrayletras.length; x++){
            arrayletras[x] = array2[1].charAt(x);
            System.out.println(arrayletras[x]);
        }

        //3.Agregar 10 valores de tipo Integer en un arreglo, imprime cada uno de los valores y su indíce correspondiente

        Integer[] valoresAleatorios = {123, 42, 4354, 554, 5452, 42123, 312, 212, 3413, 313};
        int x = 0;
        while(x < valoresAleatorios.length-1) {
            System.out.println("Valor :"+valoresAleatorios[x]+" Indíce: "+x);
            x++;
        }

        /*4. Utilizando el arreglo del ejercito anterior copia su contenido a otro arreglo que se llame "copiaEjercicio3" e imprime cada valor
        de ambos arreglos en consola */
        Integer[] copia = new Integer[valoresAleatorios.length];

        for(int xx = 0; xx<valoresAleatorios.length;xx++) {
            copia[xx] = valoresAleatorios[xx];
        }

        for(int xx = 0; xx<valoresAleatorios.length;xx++) {
            System.out.println("Original: "+valoresAleatorios[xx]+" Copia"+copia[xx]);
        }
    }
}
