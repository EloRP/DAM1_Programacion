package recursividad;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        System.out.println("Introduce un número N.");
        Scanner sc = new Scanner(System.in);
        int numSuma = sc.nextInt();
        System.out.println("La suma de todos los números enteros desde 1 hasta " + numSuma + " es: " + sumaN(numSuma));
        sc.close();
    }
    public static long sumaN (int n) {
        long resultadoSuma;
    {
        if (n==0) {
            resultadoSuma = 0;
        } else {
            resultadoSuma = n + sumaN(n-1);
        }
    }
    return (resultadoSuma);
    }
    }

