package condicionalesparaninfo;

/*
EP0317. Para dos números dados, a y b, es posible buscar el máximo común divisor
(el número más grande que divide a ambos)
mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b,
ir buscando, de forma decreciente, el primer número que divide a ambos simultáneamente.
Realiza un programa que calcule el máximo común divisor de dos números.
*/
import java.util.Scanner;

public class EP0217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXIMO = 100;
        int sumando1;
        int sumando2;
        int numeroIntroducido;
        int aciertos = 0;
        boolean fallo = false;

        System.out.println("CALCULO MENTAL: SUMAS");
        System.out.println("Acierta el máximo número de sumas posibles.");

        do {
            sumando1 = (int) (Math.random() * MAXIMO + 1);
            sumando2 = (int) (Math.random() * MAXIMO + 1);

            System.out.println(sumando1 + " + " + sumando2 + " =");
            numeroIntroducido = sc.nextInt();

            if (sumando1 + sumando2 == numeroIntroducido) {
                System.out.println("¡Bien!");
                aciertos++;
            } else {
                System.out.println("¡Fallaste! El resultado era: " + (sumando1 + sumando2) + ".");
                fallo = true;
            }
        } while (fallo == false);

        sc.close();
        System.out.println("Has acertado: " + aciertos + ".");
    }
}
