public class Triangulo extends Figura {

    private double area;

    public Triangulo(int ancho, int alto) {
        super(ancho,alto);
        area = ((double)ancho*alto)/2;
        
    }

    @Override
    public double Area() {
        // TODO Auto-generated method stub
        
        return area;
    }
    
}
