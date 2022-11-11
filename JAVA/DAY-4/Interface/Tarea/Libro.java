public class Libro extends Biblioteca implements PrestarLibro {

    private boolean prestado = false;

    public Libro(String codigo, String titulo, String estado, int year) {
        super(codigo,titulo,estado,year);
    }

    @Override
    public void prestar() {
        // TODO Auto-generated method stub
        this.prestado = true;
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        this.prestado = false;
    }

    @Override
    public void prestado() {
        // TODO Auto-generated method stub
        if(prestado){
            System.out.println("El libro fue prestado");
        } else {
            System.out.println("El libro está disponible");
        }
        
    }
    
}
