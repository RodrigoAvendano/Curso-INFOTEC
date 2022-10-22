public class Conversiones {
    
    public static void main(String[] args){

        System.out.println("Explícitas");
        
        double d = 100.04; 
         
        //casting de tipo
        long l = (long)d;
         
        //casting de tipo
        int i = (int)l; 

        System.out.println("Valor Double "+d);
         
        //parte fraccionaria perdida
        System.out.println("Valor Long "+l); 
         
        //parte fraccionaria perdida
        System.out.println("Valor Int "+i); 

        System.out.println("Implícitas");

        byte x = 5;
        int y = x;
        float z = y;

        System.out.println("X: " + x + ", Y: "+ y +", Z: "+z);

    }

}