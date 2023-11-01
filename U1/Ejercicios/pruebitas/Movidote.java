package pruebitas;
import java.util.Random;
import java.util.Scanner;

public class Movidote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int monto = 450;
        int danoTotal = 0;

        System.out.println("Elige un hechizo:");
        System.out.println("1. Misil Mágico");
        System.out.println("2. Eldritch Blast");

        int eleccion = scanner.nextInt();

        if (eleccion == 1) {
            int numProyectiles = 8;
            System.out.println("Has lanzado misil mágico " + numProyectiles + " veces...");

            for (int i = 0; i < numProyectiles; i++) {
                if (random.nextDouble() < 0.5) {
                    danoTotal += 7;
                }
            }
        } else if (eleccion == 2) {
            int numProyectiles = random.nextInt(3) + 1;
            System.out.println("Lanzando eldritchBlast " + numProyectiles + " veces...");

            for (int i = 0; i < numProyectiles; i++) {
                if (random.nextDouble() < 0.5) {
                    danoTotal += 18;
                }
            }
        } else {
            System.out.println("Opción no válida.");
            scanner.close();
            return;
        }

        monto -= danoTotal;
        System.out.println("Daño total causado: " + danoTotal);
        scanner.close();
    }
}