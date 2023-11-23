package apuntes;

public class CuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("53864409L", "Elo");
        c1.ensenharDatos();

        c1.ingresoDinero(10000);

        c1.ensenharDatos();
    }

    String dni;
    String titular;
    double saldo;

    public CuentaCorriente(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);
    }

    CuentaCorriente(String dni, String titular, double saldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    void ensenharDatos() {
        System.out.println("Cuenta corriente:");
        System.out.println("- DNI del titular: " + dni);
        System.out.println("- Saldo del titular: " + saldo + " euros");
        System.out.println("- Titular de la cuenta corriente: " + titular);
    }

    void ingresoDinero(double importe) {
        saldo += importe;
        System.out.println("[El saldo tras el ingreso es de: " + saldo + " euros.]");
    }

    boolean retiradaDinero(double importe) {
        boolean retiradaAutorizada = false;

        if (saldo >= importe)
            ;
        {
            saldo -= importe;
            retiradaAutorizada = true;
        }

        if (saldo <= importe)
            ;
        {
            retiradaAutorizada = false;
        }
        return retiradaAutorizada;

    }
}
