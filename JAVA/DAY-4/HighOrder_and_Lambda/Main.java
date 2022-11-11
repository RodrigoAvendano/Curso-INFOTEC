public class Main {
    public static void main(String[] args) {
        //POO
        Implementacion instancia = new Implementacion();
        String resultado = instancia.concatena("1000");
        System.out.println(resultado);
        //PF
        //Clase Anónima
        InterfazFuncional inter = new InterfazFuncional() {
            @Override
            public String concatena(String x) {
                return "Clase anónima :"+x;
            }
        };

        String resultado2 = inter.concatena("2000");
        System.out.println(resultado2);

        concatenaSuperior(instancia);
        concatenaSuperior(inter);

        //LAMBDA
        /* ESTRUCTURA : () -> {};
        1. ()
        -Sin parámetros se debe colocar()
        -Si solo tiene un parámetro (s) -> {} || s -> {}
        -Más de 1 parámetro (s,x) -> {} || (String s, Integer x) -> {}

        2. {}
        a){ Integer suma = 4+4 
            System.out.printlm(suma);}
        b){return "cadena"}
        c) "cadena"
        */

        InterfazFuncional lambda1 = (String s) -> {
            Integer suma = 4+4;
            return "Lambda 1: Retorno "+suma+" parámetro "+s;
        };
        InterfazFuncional lambda2 = (s) -> "Lambda 2: "+(4+4)+" parámetro "+s;

        concatenaSuperior(lambda1);
        concatenaSuperior(lambda2);

        Gato gato = new Gato();
        concatenaSuperior(gato::miau);

    }

    public static void concatenaSuperior(InterfazFuncional inter) {
        System.out.println(inter.concatena("HighOrder"));
    }
}
