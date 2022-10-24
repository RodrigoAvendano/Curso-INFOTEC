public class Java_Strings {
    public static void main(String[] args){
        //String stringPrueba = new String("Hola");
        //String stringPrueba2 = new String(stringPrueba);
        String nombre, apellido, nombre_apellido;
        nombre = "Rodrigo";
        apellido = "Avendaño";
        nombre_apellido = nombre+" "+apellido;
        System.out.println("Mi nombre es "+nombre_apellido);
        System.out.println("Mi nombre es "+nombre+" "+apellido);

        //Métodos
        String cadena = "cadena de texto";
        //length
        System.out.println("Función length(): "+cadena.length());
        System.out.println("Función substring(int i, int j): "+cadena.substring(10, 15));
        System.out.println("Función substring(): "+cadena.substring(6));
        System.out.println("Función indexOf: "+cadena.indexOf("texto"));
        System.out.println("Función equals(): "+cadena.equals("cadena de Texto"));
        System.out.println("Función equalIgnoreCase(): "+cadena.equalsIgnoreCase("cadena de TEXTO"));
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        
        //Números a cadena
        double cadenaDouble = 14.58;
        int cadenaInt = 5;
        String cadena1, cadena2;
        cadena1 = Double.toString(cadenaDouble);
        cadena2 = Integer.toString(cadenaInt);
        System.out.println("Resultado: 1 --> Concatenación de ("+cadena1+"+1) con resultado : ("+(cadena1+1)+")");
        System.out.println("Resultado: 2 --> Concatenación de (1+"+cadena1+") con resultado : ("+(1+cadena1)+")");
        System.out.println("Resultado: 3 --> Concatenación de ("+cadena2 + cadena1+") con resultado: "+(cadena1+cadena2));
    }   
}