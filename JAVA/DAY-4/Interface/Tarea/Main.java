public class Main {

    public static void main(String[] args) {
        Revista natGeo = new Revista("NG-67", "National Geogrpahic en Español", "nueva", 2020, 7);
        Libro sherlockHolmes = new Libro("ISBN-45678", "Estudio en Escarlata", "dañado", 2004);
        
        System.out.println("Revista");
        natGeo.prestar();
        System.out.println(natGeo.getDatos());
        natGeo.numero();
        System.out.println(natGeo.getCodigo());

        System.out.println("\nLibros");
        System.out.println(sherlockHolmes.getDatos());
        sherlockHolmes.prestado();
        System.out.println(sherlockHolmes.getYear());
    }
    
}
