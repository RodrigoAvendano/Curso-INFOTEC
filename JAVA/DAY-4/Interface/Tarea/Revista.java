public class Revista extends Biblioteca implements PrestarRevista {

    private boolean prestamo;
    private int num;

    public Revista(String codigo, String titulo, String estado, int year, int num) {
        super(codigo,titulo,estado,year,num);
    }

    @Override
    public void prestar() {
        // TODO Auto-generated method stub
        this.prestamo = prestamo;
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        this.prestamo = prestamo;
    }

    @Override
    public void numero() {
        // TODO Auto-generated method stub
        if(prestamo){
            System.out.println("La revista N°"+num+" se encuentra prestada");
        } else {
            System.out.println("La revista N°"+num+" se encuentra disponible");
        }
    }



}
