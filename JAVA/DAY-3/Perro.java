class Perro {

    String raza;
    String tamano;
    String color;
    int edad;

    public Perro(String raza, String tamano, String color, int edad){
        this.raza = raza;
        this.tamano = tamano;
        this.color = color;
        this.edad = edad;
    }

    public String getInfo() {
        return("La raza del perro es "+raza+", es un perro "+tamano+" de color "+color+" y tiene "+edad+" años");
    }

    public String getDormir() {
        return("El "+raza+" esta durmiendo");
    }

    public static void main(String[] args) {
        Perro dog = new Perro("Maltés","chico","blanco",15); 
        System.out.println(dog.getInfo());     
    }
}

class Boorf{

    public static void ladrar(){
        String lad = "Boorf!";
    }

    public static void main(String[] args) {
        
    }
}