public class Parametros {
    public static void main(String[] args) {
        int n;
        int[] v = new int[2];
        n = 10;
        v[0] = 20;
        v[1] = 30;
        System.out.println("Antes "+n+" "+v[0]+" "+v[1]);
        cambiar(n,v);
        System.out.println("Después "+n+" "+v[0]+" "+v[1]);
    }

    public static void cambiar(int a, int[] b) {
        a = 50;
        b[0] = 60;
        b[1] = 70;
        System.out.println("Dentro "+a+" "+b[0]+" "+b[1]);
    }
}
