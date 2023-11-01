package buclesejercicios;

import java.util.Scanner;

public class E0311 {
    public static void main(String[] args) {
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para hallar su factorial: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número menor que 0.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i; // Multiplicamos el factorial por el valor actual de i
            }
            System.out.println(numero + "! = " + factorial);

        }
        }
    }




    // ???????????? //
