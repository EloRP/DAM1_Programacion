package examenud03;
//Eloy Rodal Pérez. NOTA: Fue hecho antes que el 1 y por falta de tiempo no lo he llegado a modificar.
import java.util.Scanner;

public class RecorridoAscensor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Recuento de pisos. Se suman los distintos pisos de inicio y destino de cada viaje hecho en un día.");
        System.out.println("\nIntroduce el piso en el que empieza el ascensor: ");
        int pisoActual = sc.nextInt();
        int pisosRecorridos = 0;

        System.out.println("Inserta la pareja de pisos siguiente. (-1 para terminar).");

        double llamadaAscensor = sc.nextDouble();

        //El programa se ejecuta mientras el "input" del usuario no sea -1.
        while (llamadaAscensor != -1) {
            int destinoAscensor = sc.nextInt();

            pisosRecorridos += Math.abs(destinoAscensor - pisoActual);

            pisoActual = destinoAscensor;

            System.out.println("Introduce la siguiente pareja de pisos. (-1 para terminar).");
            llamadaAscensor = sc.nextDouble();
        }
        //Impresión al terminar.
        System.out.println("El ascensor recorrió un total de " + pisosRecorridos + " piso/s durante el día.");
        sc.close();
    }
}
