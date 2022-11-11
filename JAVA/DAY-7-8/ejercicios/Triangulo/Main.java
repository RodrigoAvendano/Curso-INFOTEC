import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura");
        String stri = sc.next();
        Integer triangle = Integer.parseInt(stri);
        Triangulo triangulo = new Triangulo(triangle);        
    }
}
