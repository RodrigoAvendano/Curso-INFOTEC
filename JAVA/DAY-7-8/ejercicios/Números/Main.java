import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    do{
        System.out.println("Ingresa un número.\nPara salir ingresa -1");
        Integer numero = sc.next();
        if(numero!=-1){
            numbers.add(numero);
        }
    } while(numero != -1);
}