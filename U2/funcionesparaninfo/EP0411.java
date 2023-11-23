package funcionesparaninfo;

/*
 * EP0411. Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
*
*Superficie = 4pi * radio2
*Volumen = (4pi / 3) * radio3
*
 */
import java.util.Scanner;

public class EP0411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la esfera:");
        double radio = sc.nextDouble();
        sc.close();

        medidasEsfera(radio);
    }

    public static void medidasEsfera(double radio) {
        double pi = Math.PI;
        double superficie = 4 * pi * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * pi * Math.pow(radio, 3);

        System.out.println("Superficie de la esfera: " + superficie);
        System.out.println("Volumen de la esfera: " + volumen);
    }
}
