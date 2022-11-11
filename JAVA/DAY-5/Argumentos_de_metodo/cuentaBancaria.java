public class cuentaBancaria {
    private double saldo;
    public static int totalCuentas = 0;

    public void transferenciaSegura(cuentaBancaria origen) {
        if(this == origen)
            return;
        saldo += origen.saldo;
        origen.saldo = 0;
    }

    public cuentaBancaria() {
        this(0.0);
    }

    public cuentaBancaria(double ingreso) {
        saldo = ingreso;
        inCuentas();
    }

    public double saldo(){
        return saldo;
    }

    public static void inCuentas(){
        totalCuentas++;
    }

    public void transferencia(cuentaBancaria origen) {
        saldo += origen.saldo;
        origen.saldo = 0;
    }
    
}
