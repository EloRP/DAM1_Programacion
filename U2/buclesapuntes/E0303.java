package buclesapuntes;

import java.util.Scanner;

public class E0303 {

    public static void main(String[] args) {
        final int NUM_MAXIMO = 100;
        int numSecreto = (int) (Math.random() * NUM_MAXIMO + 1);
        int numUsuario;
        boolean numeroAcertado = false;
        boolean usuarioRendido = false;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ADIVINA EL NÚMERO SECRETO (1-" + NUM_MAXIMO + ")");

        do {

            System.out.println("Introduce un número (introduce -1 para rendirte): ");
            numUsuario = sc.nextInt();
            intentos++;

            if (numUsuario == -1) {
                System.out.println("Te has rendido.");
                usuarioRendido = true;
            } else {
                if (numUsuario > numSecreto) {
                    System.out.println("Demasiado alto!");
                } else if (numUsuario < numSecreto) {
                    System.out.println("Demasiado bajo!");
                } else {
                    System.out.println("Acertaste, enhorabuena!!");
                    numeroAcertado = true;
                }
            }
        } while (!numeroAcertado && !usuarioRendido);
        if (usuarioRendido)
            System.out.println("El número secreto era " + numSecreto);

        if (numeroAcertado && !usuarioRendido)
            System.out.println("Tu número de intentos fue de " + intentos);

        sc.close();
    }

}
