package coleccionesapuntes;

import java.time.LocalDate;

public class Persona {

    // Atributos
    String nombre;
    byte edad = 25;
    double estatura; // metros
    String dni;

    public Persona(String nombre, byte edad, double estatura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre.toString();
    }

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    Persona() {
        nombre = "Fulano";
        edad = 18;
        if (LocalDate.now().getMonthValue() == 11)
            edad = 20;

        estatura = 1.7;
    }

    // Métodos
    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", me llamo " + this.nombre + ".");
    }

    void cumplirAnhos() {
        edad++;
    }

    void crecer(double metros) {
        estatura += metros;
    }

    void mostrar() {
        System.out.println(nombre + " tiene " + edad + " años y mide " + estatura + " metros ");
    }
}
