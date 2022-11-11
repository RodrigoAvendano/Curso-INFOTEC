public class Circulo extends Figura {

    private double area;
    private double diametro;
    private double radio;
    final private double pi = 3.1416;

    public Circulo(int ancho, int alto) {
        super(ancho,alto);
        this.diametro = ancho;
        this.radio = diametro /2;
        this.area = pi*(radio*radio);
    }

    @Override
    public double Area() {
        // TODO Auto-generated method stub
        return area;
    }
    
}
