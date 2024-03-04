package stringsparaninfo;

import java.util.Arrays;
import java.util.Scanner;

import practicas.Agenda.Persona;

public class EP0614 {
    static Persona[] agenda;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        agenda = new Persona[0];
        mostrarMenu();
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1 -> add();
                case 2 -> list();
                case 3 -> search();
            }
            mostrarMenu();
            System.out.print("Opción: ");
            opcion = sc.nextInt();
        }
        sc.close();
    }

    private static void add() {
        System.out.println("\n AÑADIR CONTACTO\n");
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.print("Nombre: ");
        p.setNombre(sc.nextLine());
        System.out.print("Apellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.print("Teléfono: ");
        p.setTelefono(sc.nextLine());
        System.out.print("Correo electrónico: ");
        p.setEmail(sc.nextLine());

        agenda = Arrays.copyOf(agenda, agenda.length + 1);
        agenda[agenda.length - 1] = p;

        sc.close();
    }

    private static void search() {
        System.out.println("\n BUSCAR\n");

        if (agenda.length == 0)
            System.out.println("La agenda está vacía.");
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Información a buscar: ");
            String str = sc.nextLine();

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i].getNombre().contains(str)
                        || agenda[i].getApellidos().contains(str)
                        || agenda[i].getTelefono().contains(str)
                        || agenda[i].getEmail().contains(str))
                    System.out.println(i + ". " + agenda[i]);
            }
            sc.close();
        }
    }

    private static void list() {
        System.out.println("\n LISTADO DE CONTACTOS\n");
        if (agenda.length == 0)
            System.out.println("La agenda está vacía.");
        else {
            for (int i = 0; i < agenda.length; i++) {
                System.out.println(i + ". " + agenda[i]);
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nAGENDA");
        System.out.println("======\n");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Vaciar agenda");
        System.out.println("5. Buscar contacto");
        System.out.println("0. SALIR ");

    }
}
