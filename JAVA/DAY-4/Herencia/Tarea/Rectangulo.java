public class Rectangulo extends Figura{

    private int alto;
    private double area;

    public Rectangulo(int ancho, int alto) {
        super(ancho,alto);
        area = ancho*alto;
    }

    @Override
    public double Area() {
        // TODO Auto-generated method stub
        return area;
    }  
}
