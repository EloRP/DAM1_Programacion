package apuntes;

public class CuentaCorrienteALTER {

    public static void main(String[] args) {

        CuentaCorriente cuenta1;
        cuenta1 = new CuentaCorriente("53864409L", "Elo");
        cuenta1.ensenharDatos();

        cuenta1.ingresoDinero(10000);
        cuenta1.ensenharDatos();

        cuenta1.retiradaDinero(500);
        cuenta1.ensenharDatos();
    }

    String dni;
    String titular;
    double saldo;

    CuentaCorrienteALTER(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = 0;
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

    void ingresoDinero(double importe) {
        saldo += importe;
        System.out.println("El saldo tras el ingreso es de: " + saldo + " euros.");
    }

    void ensenharDatos() {
        System.out.println("Titular de la cuenta corriente: " + titular);
        System.out.println("DNI del titular: " + dni);
        System.out.println("Saldo del titular: " + saldo + " euros");
    }

}
