package buclesparaninfo;

/* EP0315. Diseña una aplicación que dibuje el triángulo de Pascal, para n filas.
Numerando las filas y elementos desde 0, la fórmula para obtener el m-ésimo elemento de la n-ésima fila es

E(n, m) = n!  /  m!(n - m)!

Donde n! es el factorial de n.

Un ejemplo de triángulo de Pascal con 5 filas (n = 4) es :

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
import java.util.Scanner;

public class EP0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un número entero positivo:");
        n = sc.nextInt();
        sc.close();
        // Dar a n el valor adecuado de las filas
        n += 1;

        // Calcular el triángulo
        for (int fila = 0; fila < n; fila++) {
            int valor = 1;
            for (int columna = 0; columna <= fila; columna++) {
                System.out.print(valor + "   ");
                valor = valor * (fila - columna) / (columna + 1);
            }
            System.out.println();
        }

    }
}
