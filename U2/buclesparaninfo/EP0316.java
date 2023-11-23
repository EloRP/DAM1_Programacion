package buclesparaninfo;

/* EP0316. Solicita al usuario un número n y dibuja un triángulo de base y altura n, de la forma (para n igual a 4):
   *
  * *
 * * *
* * * *
*/
import java.util.Scanner;

public class EP0316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un número entero positivo:");
        n = sc.nextInt();

        while (n < 2) {
            System.out.println("Número no válido.");
            n = sc.nextInt();
        }
        sc.close();

        for (int filas = 1; filas <= n; filas++) {
            for (int espacio = 1; espacio <= n - filas; espacio++) {
                System.out.print(" ");
            }
            for (int columnas = 1; columnas <= filas; columnas++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
