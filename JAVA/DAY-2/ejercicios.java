import java.util.logging.Logger;

public class ejercicios {
    public static void main(String[] args) {
        String palabra = "Hola mundo Java";
        //1 Obtener la longitud del texto "Hola Mundo java"
        int longitud;
        longitud = palabra.length();
        System.out.println("Longitud "+longitud);
        //2 Eliminar los espacios del texto "Hola mundo java"
        String espacios ;
        StringBuilder espacios2 = new StringBuilder();
        espacios = palabra.replace(" ","");
        System.out.println(espacios);
        for(int x=0; x<palabra.length();x++){
            if(palabra.charAt(x) !=' '){
                espacios2.append(palabra.charAt(x)); 
            }
        }
        espacios2.toString();
        System.out.println("Solución 2: "+espacios2);
        //3 Impirmir caracter por carater la palabra "Hola Mundo Java"
        for (int i = 0; i <palabra.length(); i++) {
            System.out.print(palabra.charAt(i)+" ");
        }

        //4 Invierte la cadena "Hola mundo Java"
        //String palabraInv = "";
        StringBuilder palabraInv  = new StringBuilder();
        for(int x=0; x<palabra.length();x++){
            palabraInv.append(palabra.charAt(x)); 
        }
        palabraInv.reverse();
        System.out.println("\nCadena Inv. ="+palabraInv);
        //5 Cuenta las vocales de la palabra "Hola mundo Java"
        int contador = 0;
        int y;
        char[] vocales = {'a','e','i','o','u'};
        for(int x=0; x<palabra.length();x++){
            for(y=0;y<vocales.length;y++){
                if(palabra.charAt(x) == vocales[y]){
                    contador++;
                }
            }
        }
        System.out.println("Las vocales son: "+contador);
        // -- opción 2 ---
        String vocales2 = "aeiou";
        contador = 0;
        for(int x=0; x<palabra.length();x++){
            if(vocales2.indexOf(palabra.charAt(x)) != -1){
                contador++;
            }
        }
        System.out.println("Las vocales 2 son: "+contador);
        //6 Contar el número de palabras en la cadena "Hola mundo java"
        String[] arrayString = palabra.split(" ");
        System.out.println("El número de palabras es "+arrayString.length);
        //7 Usando las cadenas "Hola mundo Java" agrega un guión medio a lado derecho de cada carácater
        StringBuilder palabraModificada = new StringBuilder();
        for(int x=0; x<palabra.length();x++){
            palabraModificada.append(palabra.charAt(x)+"-");
        }
        System.out.println("La palabra modificada es "+palabraModificada);
        //8 Obtiene de cada acrácter de la cadena "Hola mundo Java" su código ASCII
        for(int x=0; x<palabra.length();x++){
            System.out.println(palabra.charAt(x)+" - "+(int)palabra.charAt(x));
        }
        //9 Usando la cadena "Hola mundo Java" obten la palabra Java
        System.out.println(palabra.substring(11));
    }
}