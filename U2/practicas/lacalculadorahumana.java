package practicas;

import java.util.Scanner;

/* Eloy Rodal Pérez y Xabier Cendón Pazos */

public class lacalculadorahumana {
    public static void main(String[] args) {
        // Declaración de constantes
        final int RESULTADOMAXIMO = 200;
        final int OPERANDOMINIMO = 1;
        final int OPERANDOMAXIMO = 100;
        final int FALLOSMAXIMOS = 10;

        // Inicialización de variables
        int preguntasIncorrectas = 0;
        int preguntasCorrectas = 0;
        int operando1;
        int operando2;
        byte operacion;
        int resultado = 400; //Inicialización de un valor inicial.
        int respuesta;
        Scanner sc = new Scanner(System.in);

        // Mensajes iniciales para el usuario
        System.out.println("Escribe el resultado de la operación. Tienes 10 intentos.");
        System.out.println("Si aciertas 7 preguntas, ganas.");

        // Bucle principal que controla el juego
        while (preguntasCorrectas <= 7 && preguntasIncorrectas != FALLOSMAXIMOS) {
            // Generación de números aleatorios
            operando1 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
            operando2 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
            operacion = (byte) (Math.random() * 4 + 1);

            do {
                switch (operacion) {
                    case 1:
                        resultado = operando1 + operando2;
                        System.out.println(operando1 + "+" + operando2);
                        break;
                    case 2:
                        resultado = operando1 - operando2;
                        System.out.println(operando1 + "-" + operando2);
                        break;
                    case 3:
                    // Solo genera multiplicaciones cuyo resultado sea menor a 200, sus operandos no sean 1 y sus operandos no sean iguales
                        while ((operando1 * operando2 > RESULTADOMAXIMO) || (operando1 == 1 ||operando2 == 1) || (operando1==operando2)) {
                            operando1 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
                            operando2 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
                        }
                        System.out.println(operando1 + "*" + operando2);
                        break;
                    case 4:
                    //Bucle para asegurarse de que el resultado sea exacto y que no genere números iguales, o que el divisor no sea 1
                        while ((operando1 % operando2 != 0) || (operando1 == operando2) || (operando2 == 1)) {
                            operando1 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
                            operando2 = (int) (Math.random() * OPERANDOMAXIMO + OPERANDOMINIMO);
                        }
                        resultado = operando1 / operando2;
                        System.out.println(operando1 + "/" + operando2);
                        break;
                    default:
                        System.out.println("Ha habido un error.");
                        break;
                }
            } while (resultado > RESULTADOMAXIMO);

            respuesta = sc.nextInt();

            if (respuesta == resultado) {
                preguntasCorrectas++;
                System.out.println("Respuesta correcta.");
            } else {
                preguntasIncorrectas++;
                System.out.println("Respuesta incorrecta.");
            }
        }

        // Mensajes de resultado del juego
        if (preguntasCorrectas == 7) {
            System.out.println("Felicidades, has ganado.");
        }
        if (preguntasIncorrectas == FALLOSMAXIMOS) {
            System.out.println("Has perdido al alcanzar el límite de fallos.");
        }

        // Cierre de la instancia de Scanner
        sc.close();
    }
}