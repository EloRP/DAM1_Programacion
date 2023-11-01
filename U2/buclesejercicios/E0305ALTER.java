package buclesejercicios;

import java.util.Scanner;

public class E0305ALTER {
    /*
     * E0305. Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
     * El jugador tendrá que introducir la solución de la suma de dos números
     * aleatorios comprendidos entre 1 y 100. Mientras la solución sea correcta, el
     * juego continuará. En caso contrario, el programa terminará y mostrará el
     * número de operaciones realizadas correctamente.
     *
     * Variante. Permite al usuario un número limitado de fallos.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operacionesAcertadas = 0;
        boolean continuar = true;
        final int NUM_MAXIMO = 100;
        int numeroIntentos = 3;
        while (continuar) {
            ;
            int num1 = (int) (Math.random() * NUM_MAXIMO + 1);
            int num2 = (int) (Math.random() * NUM_MAXIMO + 1);
            int solución = num1 + num2;

            System.out.println("Cuál es la suma de los siguientes números?: " + num1 + "+" + num2);
            int respuesta = sc.nextInt();

            if (respuesta == solución) {
                operacionesAcertadas++;
                System.out.println("Bien, has acertado");
            }
            if (respuesta != solución){
                numeroIntentos--;
                System.out.println("Mal. Te queda/n " + numeroIntentos + " intento/s antes de perder.");
            }
            if (numeroIntentos == 0){
                continuar = false;
                System.out.println("Mal ahí compañer@, has perdido.");
            }
        }
        System.out.println("Has acertado " + operacionesAcertadas + " operaciones en total.");
        sc.close();
    }
}
