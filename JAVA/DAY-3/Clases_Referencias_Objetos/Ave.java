public class Ave{
    //variables de instancia
    String nombre;
    String raza;
    int edad;
    String color;
    //Declaración del constructor de la clase
    public Ave(String nombre, String raza, int edad, String color) {
        //this-> hace referencia a las variables que se encuentran arriba
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    //método 1.
    public String getNombre() {
        return nombre;
    }
     //método 2.
     public String getRaza() {
        return raza;
    }
     //método 3.
    public int getEdad() {
        return edad;
    }
     //método 4.
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return("Hola, soy un pájaro, mi nombre es: "+this.getNombre()+
        "\nMi raza, edad y color son: "+this.getRaza()+", "+this.getEdad()+", "+this.getColor());
    }

    public static void main(String[] args) {
        Ave periquito = new Ave("Oliv", "periquito", 5, "verde");
        System.out.println(periquito.toString());
    }
}