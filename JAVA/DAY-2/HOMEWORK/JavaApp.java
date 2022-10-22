public class JavaApp {
    
    // Para imprimir resultados en consola utilizar -> System.out.println();

    public static void main(String[] args){
    // Su código en esta parte
    
        //1. Palabras Reservadas
        System.out.println("1. Palabra Reservada FOR");
        char b = 0x0041;//"A" unicode
        for(String a = "A"; !a.equals("ABC"); a += b) {
            System.out.println(a);
            b++;
        }

        System.out.println("2. Palabra Reservada IF-ELSE"); 
        
        int dinero = 100;

        if(dinero>200){
            System.out.println("Puedo comprar un libro");
        } else {
            System.out.println("No puedo comprar un libro");
        }

        System.out.println("3. Palabra Reservada INT"); 

        int salario = 9800;
        int bono = 600;
        int total = salario + bono;

        System.out.println("Mi pago mensual fue de $"+total);

        System.out.println("4. Palabra Reservada LONG"); 

        long numeroGrande = 3000_000_000L;
        System.out.println("Candtidad Long: "+numeroGrande);

        System.out.println("5. Palabra Reservada SHORT");
        
        short numeroChico = -3000;
        System.out.println("Candtidad short :"+numeroChico);

    }

}
