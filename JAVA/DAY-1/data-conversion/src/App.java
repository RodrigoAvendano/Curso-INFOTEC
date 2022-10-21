public class App {
    public static void main(String[] args) throws Exception {

        //Parte 1
        int  varI = 400;
        long l = varI;

        float f = l;

        System.out.println(varI);
        System.out.println(l);
        System.out.println(f);

        //Parte 2

        char ch = 'z';
        int varInt = ch;
        ch = (char) varInt;

        System.out.println(ch);

        //Parte 3
        double varD = 300.45;
        long varL = (long)varD;
        int varIn = (int)varL;

        System.out.println(varD);
        System.out.println(varL);
        System.out.println(varIn);

        byte byte1 = 100;
        byte byte2 = 10;
        long datoLong = 200;
        float datofloat = 15.04f;
        double datodouble = 300.034;
        
        int operacion1 = (int) (byte1*byte2+datoLong);
        double operacion2 = byte1*byte2+datoLong+datofloat+datodouble;

        System.out.println(operacion1);
        System.out.println(operacion2);
    }
}
