package coleccionesejercicios.EP1216;

import java.time.LocalDate;
import java.util.*;

public class AppGestionSocios {
    /* @author Eloy Rodal Pérez
     * EP1216. Implementa una aplicación que gestione los socios de un club usando
     * la clase Socio implementada en la Actividad E1211. En particular, se deberán
     * ofrecer las opciones de alta, baja y modificación de los datos de un socio.
     * Además, se listarán los socios por nombre o por antigüedad en el club.
     */
    static Map<String, Socio> m = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1 -> darAltaSocio();
                case 2 -> darBajaSocio();
                case 3 -> modificarSocio();
                default -> System.out.println("Opción inválida, inténtelo de nuevo.");
            }
            mostrarMenu();
            opcion = sc.nextInt();
        }

        listarSocio((a, b) -> a.nombre.compareTo(b.nombre));
        listarSocio((a, b) -> a.antiguedad() - b.antiguedad());

        sc.close();
    }

    private static void darAltaSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();

        if (m.containsKey(apodo)) {
            System.out.println("ERROR. Ya existe un socio con ese apodo.");
        } else {
            putSocio(apodo);
            System.out.println("Socio dado de alta correctamente.");
        }
        sc.close();
    }

    private static void darBajaSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();
        if (m.containsKey(apodo)) {
            m.remove(apodo);
            System.out.println("Socio eliminado correctamente.");
        } else {
            System.out.println("ERROR. No existe un socio con ese apodo.");
        }
        sc.close();
    }

    private static void modificarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();

        if (!m.containsKey(apodo)) {
            putSocio(apodo);
            System.out.println("Socio modificado correctamente.");
        } else {
            System.out.println("El socio no existe.");
        }

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("[------- MENÚ -------]");
        System.out.println("1. Alta socio.");
        System.out.println("2. Baja socio.");
        System.out.println("3. Modificación socio.");
        System.out.println("4. Salir.");
    }

    private static void putSocio(String dni) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la fecha de alta (aaaa-mm-dd): ");
        String fechaAlta = sc.nextLine();
        LocalDate fechaIngreso = LocalDate.parse(fechaAlta);
        m.put(dni, new Socio(dni, nombre, fechaIngreso));
        sc.close();
    }

    private static void listarSocio(Comparator<Socio> comparador) {
        Collection<Socio> coleccionSocios = m.values();
        Socio[] socios = new Socio[m.size()];
        coleccionSocios.toArray(socios);
        Arrays.sort(socios, comparador);

        System.out.println(Arrays.toString(socios));
    }
}