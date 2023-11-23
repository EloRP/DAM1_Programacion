package buclesapuntes;

import java.util.Scanner;

public class E0315Numero {

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int numero;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();

        // Proceso & Salida
        for (int i =  1; i <= numero; i++) {
            for (int j = 1; j <= (numero + 1 -i); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }

}
