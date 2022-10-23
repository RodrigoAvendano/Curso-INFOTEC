import java.util.Scanner;

public class Operadores {
    
    public static void main(String[] args){

        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingresa cantidad 1: ");

        int cant1 = lectura.nextInt();
        
        System.out.println("Ingresa cantidad 2: ");

        int cant2 = lectura.nextInt();

        double suma, resta, mult, div;

        suma = cant1 + cant2;

        resta = cant1 - cant2;

        mult = cant1 * cant2;

        div = cant1 / cant2;

        System.out.print("Suma: " + suma + 
        "\nResta: " + resta + 
        "\nMultiplicación: " + mult + 
        "\nDivisión: " + div + "\n");

        lectura.close();
    }
}