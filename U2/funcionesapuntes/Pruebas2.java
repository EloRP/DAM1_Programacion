package funcionesapuntes;

import java.util.Scanner;

public class Pruebas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Número de saludos: ");
        int veces = sc.nextInt();
        saludar(nombre, veces);
        // saludar("María", 5);
        // saludar("Jaime", 5);
    }

    static void saludar(String nombre, int numSaludos) {
        for (int i = 0; i < numSaludos; i++) {
            int j = i + 1;
            System.out.println(j + ". Hola " + nombre + "!!!");
        }
    }
}

// La declaración de la función se hace fuera del main.
// static tipo nombreFunción() {
// cuerpo de la función
// }
