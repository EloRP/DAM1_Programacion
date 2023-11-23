package recursividad;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la base de la potencia.");
        int basePotencia = sc.nextInt();
        System.out.println("Ahora, escribe el exponente (positivo).");
        int exponentePotencia = sc.nextInt();
        System.out.println("La potencia del número de base " + basePotencia + " y exponente " + exponentePotencia + " es de " + potencia(basePotencia, exponentePotencia));
        sc.close();
    }

    public static long potencia(long base, long exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * potencia(base, exponente - 1); // base por (base * exponente-1). P.EJ: 2 * (2 * 8-1) (repite
                                                         // hasta suceso de arriba)
        }
        return exponente;
    }
}
