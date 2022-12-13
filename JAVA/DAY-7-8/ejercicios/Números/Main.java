import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.println("Ingresa un número.\nPara salir ingresa -1");
        Double numero = sc.nextDouble();
        if(numero != -1){
            numbers.add(numero);
            do{
                System.out.println("Ingresa un número.\nPara salir ingresa -1");
                numero = sc.nextDouble();
                if(numero!=-1){
                    numbers.add(numero);
                }
            } while(numero != -1);
        }
        Numeros num = new Numeros(numbers);
    }
}