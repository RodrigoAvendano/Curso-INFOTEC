public class Triangulo {
    int altura;

    Triangulo(int altura) {
        this.altura = altura;  
        trianguloLleno(this.altura);    
        trianguloVacio(this.altura);             
    }

    public void trianguloLleno(Integer num){

        Integer cont = num;
        for(int x = 0; x < num; x++) {
            for(int y = cont; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println("\n");
            cont--;
        }
    }

    public void trianguloVacio(Integer num){

        Integer cont = num;
        for(int x = 0; x < num; x++) {
            for(int y = cont; y > 0; y--) {
                if (cont == num || cont == 1) {
                    System.out.print("*");
                } else {
                    if(y == cont || y == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("\n");
            cont--;
        }

    }
    
}
