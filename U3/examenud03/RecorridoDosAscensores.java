package examenud03;
//Eloy Rodal Pérez
import java.util.Scanner;
//Nota, está sin terminar. La idea que tenía era emplear el mismo código del primero e ir repitiendo una y otra vez hasta el -1. De ahí habría una suma separada.
public class RecorridoDosAscensores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Recuento de pisos de dos ascensores. Se suman los distintos pisos de inicio y destino de cada viaje hecho en un día.");
        System.out.println("\nIntroduce el piso en el que empieza el primer ascensor: ");
        int pisoActualAscensor1 = sc.nextInt();
        int pisosRecorridos = 0;

        System.out.println("\nIntroduce el piso en el que empieza el segundo ascensor: ");
        //int pisoActualAscensor2 = sc.nextInt();
        //int pisosRecorridosAscensor2 = 0;


        System.out.println("Inserta la pareja de pisos siguiente del primer ascensor. (-1 para terminar).");

        double llamadaAscensor = sc.nextDouble();
        
        //El programa se ejecuta mientras el "input" del usuario no sea -1.
        while (llamadaAscensor != -1) {

            int destinoAscensor = sc.nextInt();

            pisosRecorridos += Math.abs(destinoAscensor - pisoActualAscensor1);

            pisoActualAscensor1 = destinoAscensor;

            System.out.println("Introduce la siguiente pareja de pisos. (-1 para terminar).");
            llamadaAscensor = sc.nextDouble();
        }
        //Impresión al terminar.
        System.out.println("El ascensor recorrió un total de " + pisosRecorridos + " piso/s durante el día.");
        sc.close();
    }
}
