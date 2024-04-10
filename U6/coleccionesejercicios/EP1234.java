package coleccionesejercicios;
/*
 * @author Eloy Rodal Pérez     SIN TERMINAR.
 * EP1234. Amplía la Actividad E1214, de forma que se gestionen los registros de
 * temperatura de diferentes días en la misma aplicación. Para ello, implementa
 * un mapa cuyas entradas tendrán como clave la fecha y como valor el conjunto
 * con los registros de un dia. Implementa también un programa que gestione los
 * registros del dia actual y permita visualizar los de un día cualquiera, junto
 * con sus estadísticas. Al arrancar el programa se cargará en memoria el mapa a
 * partir del fichero correspondiente y, al terminar, se volverá a guardar
 * actualizado.
 */
/* 

import static coleccionesejercicios.Temperaturas.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import coleccionesejercicios.Registro;

public class EP1234 extends Temperaturas {

    public static void main(String[] args) {

        Map<LocalDate, List<Registro>> temperaturasData = leerFichero()
        String nombreArchivo = "registros-" + LocalDate.now() + ".dat";
        listaTemperaturas.addAll(leerTemperaturas(nombreArchivo));
        Scanner sc = new Scanner(System.in);
        mostrarMenuPrincipal();
        int opcion = sc.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    nuevoRegistro();
                    break;
                case 2:
                    listarRegistros();
                    break;
                case 3:
                    mostrarEstadistica();
                    break;
            }
            mostrarMenuPrincipal();
            opcion = sc.nextInt();
        }
    }

    static Map<LocalDate, List<Registro>> guardarDia(LocalDate fecha, List<Registro> temperaturas) {
        Map<LocalDate, List<Registro>> temperaturasDia = new TreeMap<>();
        temperaturasDia.put(fecha, temperaturas);
        return temperaturasDia;
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\nMENÚ PRINCIPAL - REGISTRO DE TEMPERATURAS");
        System.out.println("=========================================");
        System.out.println("1. Nuevo registro");
        System.out.println("2. Listar registros");
        System.out.println("3. Mostrar estadística");
        System.out.println("0. Salir");
    }

        static Collection<Temperatura> leerFichero(String nombreArchivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            // Leer la colección de temperaturas del archivo
            return (Collection<Temperatura>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer las temperaturas del archivo: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
*/