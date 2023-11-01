package buclesejercicios;

import java.util.Scanner;

public class E0303 {
    /*
     * E0303. Codificar el juego “el número secreto”, que consiste en acertar un
     * número entre 1 y 100 (generado aleatoriamente). Para ello se introduce por
     * teclado una serie de números, para los que se indica: “mayor” o “menor”,
     * según sea mayor o menor con respecto al número secreto. El proceso termina
     * cuando el usuario acierta o cuando se rinde (introduciendo un -1).
     * Amplía el programa para que muestre el número secreto cuando el usuario se
     * rinda y el número de intentos cuando haya acertado.
     */
    public static void main(String[] args) {
        // Declaración de variables y constantes
        final int NUM_MAXIMO = 100;
        int numSecreto = (int) (Math.random() * NUM_MAXIMO + 1);
        int numUsuario;
        boolean numeroAcertado = false;
        boolean usuarioRendido = false;
        int intentos = 0;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("ADIVINA EL NÚMERO SECRETO (1-" + NUM_MAXIMO + ")");

        do {
            // Cuerpo del bucle
            // Leer número
            System.out.println("Introduce un número (introduce -1 para rendirte): ");
            numUsuario = sc.nextInt();
            intentos++;

            // Comparar con número secreto
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
