package buclesparaninfo;

/* EP0317. Para dos números dados, a y b, es posible buscar el máximo común divisor (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo:
desde el menor de a y b, ir buscando, de forma decreciente, el primer número que divide a ambos simultáneamente.
Realiza un programa que calcule el máximo común divisor de dos números. */
import java.util.Scanner;

public class EP0317 {

    public static void main(String[] args) {
        int a, b, divisor, mcd = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números enteros positivos:");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if (a < b) {
            divisor = a;
        } else {
            divisor = b;
        }

        if (a > 0 && b > 0) {
            while (mcd != divisor) {
                if (a % divisor == 0 && b % divisor == 0) {
                    mcd = divisor;
                } else {
                    divisor -= 1;
                }
            }
            System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
        }
    }
}
