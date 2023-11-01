package funcionesapuntes;

public class Pruebas {

    static String nombreNuevo = "Paco";

    public static void main(String[] args) {
        String nombre = "Josue macmanamar";
        System.out.println(nombreNuevo);
        tresSaludos();
        saludarNombre();
    }

    static void tresSaludos() {
        System.out.println("Voy a saludar tres veces");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hola.");
        }
    }

    static void saludarNombre() {
        String nombre = "Eloy";
        nombre = nombreNuevo;
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println(j + ". Hola " + nombre + "!!!");
        }
    }
}

// La declaración de la función se hace fuera del main.
// static tipo nombreFunción() {
// cuerpo de la función
// }
