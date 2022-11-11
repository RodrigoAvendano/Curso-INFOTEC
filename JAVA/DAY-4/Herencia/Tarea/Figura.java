public abstract class Figura {
    
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private double perimetro;
    private double area;

    public Figura(int ancho, int alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public abstract double Area();
}
