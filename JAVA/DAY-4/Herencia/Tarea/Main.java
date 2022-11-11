public class Main {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(60,20);
        System.out.println("El área del retcangulo es :"+rectangulo.Area());
        Circulo circulo = new Circulo(60,60);
        System.out.println("El área del Círculo es :"+circulo.Area());
        Triangulo triangulo = new Triangulo(40,20);
        System.out.println("El área del Triangulo es :"+triangulo.Area());
    }
}
