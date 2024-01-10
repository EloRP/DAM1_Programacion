package repaso_recu;

import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        boolean respuestaCorrecta = false;

        while (!respuestaCorrecta) {
            System.out.println("Adivina el número aleatorio entre el 1 y el 100.");
            int respuestaUsuario = sc.nextInt();
            if (respuestaUsuario == numeroAleatorio) {
                respuestaCorrecta = true;
                System.out.println("Enhorabuena! Has acertado.");
            } else if (respuestaUsuario > numeroAleatorio) {
                System.out.println("El número aleatorio es menor que el que se ha escrito, inténtalo de nuevo.");
            } else {
                System.out.println("El número aleatorio es mayor que el que se ha escrito, inténtalo de nuevo.");
            }
        }
        sc.close();
    }
}
