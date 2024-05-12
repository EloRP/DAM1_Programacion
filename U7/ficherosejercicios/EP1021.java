package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EP1021 {

    /*
     * @author Eloy Rodal Pérez
     * 
     * @description EP1021. Diseña una pequeña agenda, que muestre el siguiente
     * menú:
     * 
     * 1. Nuevo contacto.
     * 2. Buscar por nombre.
     * 3. Mostrar todos.
     * 4. Salir.
     * 
     * En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
     * 
     * La opción 1 nos permitirá introducir un nuevo contacto siempre y cuando la
     * agenda no esté llena, comprobando que el nombre no se encuentra insertado ya.
     * La opción 2 muestra todos los teléfonos que coinciden con la cadena que se
     * busca. Por ejemplo, si tecleamos «Pe", mostrará el teléfono de Pedro, de Pepe
     * y de Petunia.
     * La opción 3 mostrará un listado con toda la información (nombres y teléfonos)
     * ordenados alfabéticamente por el nombre.
     * Por último, la opción 4 guarda todos los datos de la agenda en el archivo
     * agenda.txt. La próxima vez que se ejecute la aplicación, si hay datos
     * guardados, se cargarán en memoria.
     * 
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> agenda = cargarAgenda();

        menu();
        int opcion = sc.nextInt();

        while (opcion != 4) {
            switch (opcion) {
                case 1 -> anhadirContacto(agenda);
                case 2 -> buscarPorNombre(agenda);
                case 3 -> mostrarContactos(agenda);
                case 4 -> {
                    guardarAgenda(agenda);
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opción no válida.");
            }
            menu();
            opcion = sc.nextInt();
        }
    }

    public static void menu() {
        System.out.println("Menú de la agenda: ");
        System.out.println("1. Nuevo contacto.");
        System.out.println("2. Buscar por nombre.");
        System.out.println("3. Mostrar todos.");
        System.out.println("4. Salir.");
    }

    public static TreeMap<String, String> cargarAgenda() {
        TreeMap<String, String> agenda = new TreeMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader("agenda.txt"))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] partes = linea.split(" - ");
                if (partes.length == 2) {
                    agenda.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la agenda: " + e.getMessage());
        }
        return agenda;
    }

    public static void guardarAgenda(TreeMap<String, String> agenda) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("agenda.txt"))) {
            for (Map.Entry<String, String> entry : agenda.entrySet()) {
                out.write(entry.getKey() + " - " + entry.getValue() + '\n');
            }
        } catch (IOException ex) {
            System.out.println("Error al guardar la agenda: " + ex.getMessage());
        }
    }

    public static void mostrarContactos(TreeMap<String, String> agenda) {
        System.out.println("Contactos:");
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void anhadirContacto(TreeMap<String, String> agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre que quieras añadir:");
        String nombreUser = sc.nextLine();
        if (agenda.containsKey(nombreUser)) {
            System.out.println("El nombre ya se encuentra en la agenda.");
            return;
        }
        System.out.println("Introduce el teléfono:");
        String telfUser = sc.nextLine();
        agenda.put(nombreUser, telfUser);
        System.out.println("Contacto añadido con éxito.");
    }

    public static void buscarPorNombre(TreeMap<String, String> agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre a buscar:");
        String nombreBuscar = sc.nextLine();
        boolean encontrado = false;
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            if (entry.getKey().startsWith(nombreBuscar)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron contactos con ese nombre.");
        }
    }
}