package coleccionesapuntes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Clase Cliente para ejemplos posteriores.
public class Cliente implements Comparable<Cliente> {
    protected String dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) { // Constructor de la clase Cliente
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
        } catch (Exception e) {
            this.fechaNacimiento = null;
        }
    }

    protected int edad() { // Método que devuelve la edad del cliente
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object obj) { // Método que compara dos objetos de la clase Cliente
        return dni.equals(((Cliente) obj).dni);
    }

    @Override
    public String toString() { // toString de la clase Cliente
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + " \n";
    }

    @Override // Método que compara dos objetos de la clase Cliente IMPLEMENTANDO LA INTERFAZ
              // COMPARABLE
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    class ComparaNombres implements Comparator<Cliente> { // Clase interna que implementa la interfaz Comparator
        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.nombre.compareTo(o2.nombre);
        }
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente("123 A", "Juan", "01/01/2000");
        Cliente c2 = new Cliente("456 B", "Ana", "01/01/1990");
        Cliente c3 = new Cliente("789 C", "Luis", "01/01/1980");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);

        System.out.println(listaClientes);

        System.out.println(listaClientes.size());


    }
}
