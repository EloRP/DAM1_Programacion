
package interfacesejercicios.EP0915;

import java.util.Scanner;

public class Supercola {
    public int[] cola1;
    public int[] cola2;
    int tamanhoCola1;
    int tamanhoCola2;

    

    public Supercola(int[] cola1, int[] cola2, int tamanhoCola1, int tamanhoCola2) {
        this.cola1 = cola1;
        this.cola2 = cola2;
        this.tamanhoCola1 = tamanhoCola1;
        this.tamanhoCola2 = tamanhoCola2;
    }



    public void encolar(int numero, int cola) {
        if (cola)
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un comando:");
        System.out.println();
        System.out.println(
                "\n1. Encolar en cola1." +
                        "\n2. Encolar en cola2." +
                        "\n3. Desencolar de cola1." +
                        "\n4. Desencolar de cola2." +
                        "\n5. Salir"

        );
        int comando = sc.nextInt();

        while (comando != 5) {
            switch (comando) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("No se aceptan otros valores.");
                    break;
            }
            comando = sc.nextInt();
        }
    }
}
