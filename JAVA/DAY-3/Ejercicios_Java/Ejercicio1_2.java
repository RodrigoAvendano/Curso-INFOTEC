public class Ejercicio1_2 {
    public static void main(String[] args) {
        //1. Variable
        String frase = "Aprendiendo Java";
        String fraseMayus = frase.toUpperCase();
        System.out.println("Frase mayúscula: "+fraseMayus);

        //2.Número de carácteres
        int numCar = frase.length();
        System.out.println("Número de carácteres: "+numCar);

        //3.Suma, resta, división y multiplicación
        int num1 = 5;
        int num2 = 5;
        int suma;
        int resta;
        int mult;
        int div;
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicación es "+mult);
        System.out.println("La división es "+div);

        //4. Conversión
        double cantidad = 7.4;
        String cantStr = String.valueOf(cantidad);
        System.out.println("Double en String :"+cantStr);

    }
}