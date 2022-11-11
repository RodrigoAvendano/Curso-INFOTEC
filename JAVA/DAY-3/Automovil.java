public class Automovil {
    String nombre;
    String marca;
    Double km;
    String color;

    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        auto1.color = "blanco";
        auto1.km = 100d;
        auto1.nombre = "Supre";
        auto1.marca = "Nyse";

        Automovil auto2 = new Automovil();
        auto2.color = "negro";
        auto2.km = 120d;
        auto2.nombre = "Vento";
        auto2.marca = "Nyx";
    }
}