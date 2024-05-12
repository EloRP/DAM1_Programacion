package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EP1016 {

    /*
     * @author Eloy Rodal Pérez
     * EP1016. Un libro de firmas es útil para recoger los nombres de todas las
     * personas que han
     * pasado por un determinado lugar. Crea una aplicación que permita mostrar el
     * libro de firmas
     * e insertar un nuevo nombre (comprobando que no se encuentre repetido).
     * Llamaremos al
     * fichero firmas.txt.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1 -> anhadirFirma();
                case 2 -> mostrarFirmas();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
            menu();
            opcion = sc.nextInt();
        }
    }

    public static void mostrarFirmas() {
        try (BufferedReader in = new BufferedReader(
                new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\firmas.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean anhadirFirma() {
        boolean firmaAnhadida = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre que quieras añadir.");
        String nombreUser = sc.nextLine();
        try (BufferedReader in = new BufferedReader(
                new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\firmas.txt"))) {
            String linea = in.readLine();

            while (linea != null) {
                if (linea == nombreUser) {
                    firmaAnhadida = false;
                    System.out.println("El nombre ya se encuentra en el libro de firmas.");
                }
                linea = in.readLine();
            }

            if (firmaAnhadida) {
                escribirFichero(nombreUser);
                System.out.println("Nombre añadido con éxito.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return firmaAnhadida;
    }
    
    public static void escribirFichero(String nombreUser) {
        String contenidoArchivo = "";
        try (BufferedReader in = new BufferedReader(
                new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\firmas.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                contenidoArchivo += linea + '\n'; // Se concatena cada línea al contenido del archivo
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        contenidoArchivo += nombreUser + '\n'; // Se añade el nombre del usuario al contenido del archivo*/
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\firmas.txt"))) {
            out.write(contenidoArchivo); // Se escribe todo el contenido al archivo
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void menu() {
        System.out.println("Menú del libro de firmas: ");
        System.out.println("1. Añadir firma al libro");
        System.out.println("2. Mostrar firmas");
    }
}
