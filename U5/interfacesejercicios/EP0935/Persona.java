package interfacesejercicios.EP0935;

public class Persona implements Cliente, Empleado {
    final String dni;
    String nombre;
    boolean esCliente;
    boolean esEmpleado;
    private int horasTrabajadas;
    private double saldo;

    public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
    }

    @Override
    public void setHorasTrabajadas(int horas) {
        if (esEmpleado)
            horasTrabajadas = horas;
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void incrementarSaldo(int cantidad) {
        if (esCliente)
            this.saldo += saldo;

    }

    @Override
    public void setSaldo(double saldo) {
        if (esCliente)
            this.saldo = saldo;

    }

    @Override
    public int getHorasTrabajadas() {
        if (esEmpleado) {
            return horasTrabajadas;
        } else
            throw new IllegalArgumentException("Esta persona no es un empleado.");
    }

    @Override
    public String toString() {
        String str = "Persona [dni=" + dni + ", nombre=" + nombre;
        if (esCliente)
            str += ("Saldo de cliente = " + saldo);
        if (esEmpleado)
            str += ("Horas trabajadas de empleado = " + horasTrabajadas);
        return str;
    }

    public static void main(String[] args) {
        Persona p = new Persona("3434343434343X", "Pepe", true, true);
        p.
    }

}
