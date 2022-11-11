public class PruebaCuentaBancaria {

    public static void main(String[] args) {
        System.out.println("Total Cuentas: "+cuentaBancaria.totalCuentas);
        cuentaBancaria c1;
        c1 = new cuentaBancaria(17.5);
        System.out.println("Nueva cuenta con: "+c1.saldo()+" euros");
        System.out.println("Total Cuentas: "+cuentaBancaria.totalCuentas);
        cuentaBancaria c2;
        c2 = new cuentaBancaria(20.0);
        System.out.println("Nueva cuenta con: "+c2.saldo()+" euros");
        System.out.println("Total Cuentas: "+cuentaBancaria.totalCuentas);

        System.out.println("Trasnferencia de cuenta 2 a cuenta 1");
        c1.transferencia(c2);
        System.out.println("Cuenta 1 con: "+c1.saldo()+" euros");
        System.out.println("Cuenta 2 con: "+c2.saldo()+" euros");
    }
    
}
