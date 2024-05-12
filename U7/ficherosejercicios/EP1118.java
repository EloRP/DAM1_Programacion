package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;

public class EP1118 {
    /*
     * @author Eloy Rodal Pérez
     * 
     * @description EP1118. Un libro de firmas es útil para recoger los nombres de
     * todas las personas que han pasado por un determinado lugar. Crea una aplicación que
     * permita mostrar el libro de firmas o insertar un nuevo nombre (comprobando
     * que no se encuentre repetido) usando el fichero binario firmas.dat.
     */


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashSet<String> firmas = cargarFirmas();
    
            menu();
            int opcion = sc.nextInt();
    
            while (opcion != 0) {
                switch (opcion) {
                    case 1 -> anhadirFirma(firmas, sc);
                    case 2 -> mostrarFirmas(firmas);
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
                menu();
                opcion = sc.nextInt();
            }
        }
    
        public static void menu() {
            System.out.println("Menú del libro de firmas: ");
            System.out.println("1. Añadir firma al libro");
            System.out.println("2. Mostrar firmas");
            System.out.println("0. Salir");
        }
    
        public static HashSet<String> cargarFirmas() {
            HashSet<String> firmas = new HashSet<>();
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("firmas.dat"))) {
                while (true) {
                    firmas.add((String) in.readObject());
                }
            } catch (EOFException e) {
                // Se alcanzó el final del archivo, se ignora
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar las firmas: " + e.getMessage());
            }
            return firmas;
        }
    
        public static void guardarFirmas(HashSet<String> firmas) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("firmas.dat"))) {
                for (String firma : firmas) {
                    out.writeObject(firma);
                }
            } catch (IOException e) {
                System.out.println("Error al guardar las firmas: " + e.getMessage());
            }
        }
    
        public static void mostrarFirmas(HashSet<String> firmas) {
            System.out.println("Firmas:");
            for (String firma : firmas) {
                System.out.println(firma);
            }
        }
    
        public static void anhadirFirma(HashSet<String> firmas, Scanner sc) {
            System.out.println("Introduce el nombre que quieras añadir:");
            String nombreUser = sc.nextLine();
            if (firmas.contains(nombreUser)) {
                System.out.println("El nombre ya se encuentra en el libro de firmas.");
            } else {
                firmas.add(nombreUser);
                guardarFirmas(firmas);
                System.out.println("Nombre añadido con éxito.");
            }
        }
    }
