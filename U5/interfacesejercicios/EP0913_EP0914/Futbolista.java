package interfacesejercicios.EP0913_EP0914;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Futbolista implements Comparable, Comparator{
    String dni;
    String nombre;
    int edad;
    int numGoles;

    
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Futbolista futbolista2 = (Futbolista) obj;
        return Objects.equals(this.dni, futbolista2.dni);
    }

    

    @Override
    public int compareTo(Object o) {
        Futbolista futbolista2 = (Futbolista) o;
        return dni.compareTo(futbolista2.dni);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.nombre.compareTo(f2.nombre);

    }

    public int compareNombre(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.edad - f2.edad;

    }

public static void main(String[] args) {
    Futbolista[] tabla = {
        new Futbolista("34789N", "Eloy", 37, 3478934),
        new Futbolista("34689N", "Xabi", 36, 3),
        new Futbolista("34589N", "Pepe", 35, 334),
        new Futbolista("34489N", "Segismundo", 34, 34),
        new Futbolista("34389N", "Wenceslao", 33, 46),

    };

    System.out.println(tabla);

    Arrays.sort(tabla);
    System.out.println("Futbolistas ordenados por DNI: " + Arrays.toString(tabla));
    Arrays.sort(tabla, new ComparadorNombre());
    System.out.println("\nFutbolistas ordenados por nombre: " + Arrays.toString(tabla));
    Arrays.sort(tabla, new ComparadorEdad());
    System.out.println("\nFutbolistas ordenados por edad: " + Arrays.toString(tabla));
}
    
}
