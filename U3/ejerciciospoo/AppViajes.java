package ejerciciospoo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AppViajes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;





                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
                new PuntoGeografico("IES Chan do Monte", 42.3893981, -8.7102411),
                new PuntoGeografico("Pontevedra", 42.427855645977, -8.64455335556701),
                3);

        System.out.println("\n VIAJE COMPARTIDO\n==========");
        System.out.println(viaje);
        System.out.println();

        viaje.mostrarDetalle();

        sc.close();
    }

    public static User registroConductor(Scanner sc) {
        System.out.println("\nRegistro del conductor.\n=========");
        System.out.println("Ingrese su nombre: ");
        String conductor = sc.nextLine();
        return new User(conductor);
    }

    public static Viaje nuevoViaje (Scanner sc, User conductor) {
            System.out.println("Introduce la información del viaje:\n");
            LocalDateTime salida = hora
        }

    private static LocalDateTime ingresarFechaHoraSalida(Scanner scanner) {
        System.out.print("Ingrese la fecha y hora de salida (dd/MM/yyyy HH:mm): ");
        String fechaHoraSalidaStr = scanner.nextLine();
        return LocalDateTime.parse(fechaHoraSalidaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    

    private static PuntoGeografico PuntoGeografico(Scanner sc, String tipo) {
        System.out.print("Ingrese el nombre del punto de " + tipo + ": ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la latitud del punto de " + tipo + ": ");
        double latitud = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la longitud del punto de " + tipo + ": ");
        double longitud = Double.parseDouble(sc.nextLine());
        return new PuntoGeografico(nombre, latitud, longitud);
    }

    private static int NumeroPlazas(Scanner scanner) {
        System.out.print("Ingrese el número de plazas disponibles: ");
        return Integer.parseInt(scanner.nextLine());
    }

    
}
