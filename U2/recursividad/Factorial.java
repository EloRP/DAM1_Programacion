package recursividad;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int numFactorial = sc.nextInt();
        System.out.println("El factorial de " + numFactorial + " es: " + factorial(numFactorial)); // Calcular y mostrar el factorial
        sc.close();
    }

    public static long factorial(int n) {
        long resultadoFactorial; // Declaración de la variable para almacenar el resultado del factorial
        {
            if (n == 0) { // Comprobar si el número es igual a 0 (caso base)
                resultadoFactorial = 1; // El factorial de 0 es 1
            } else {
                resultadoFactorial = n * factorial(n - 1); // Calcular el factorial de n utilizando recursividad
            }
            return resultadoFactorial; // Devolver el resultado del factorial
        }
    }
}
