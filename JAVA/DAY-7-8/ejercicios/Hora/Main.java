import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una hora en formato de 24hrs");
        String stime = sc.next();
        Integer time = Integer.parseInt(stime);
        Hora hora = new Hora(time);
    }
}