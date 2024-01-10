package ejerciciosmath;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
ClaseMath. Escribe un programa que genere y muestre un número aleatorio con decimales en el rango de -360 a 360 utilizando Math.random().
A continuación realizará y mostrará los siguientes cálculos:
su raíz cuadrada utilizando el método Math.sqrt().
el número redondeado a la cifra entera más cercana utilizando Math.round().
el número redondeado hacia arriba y hacia abajo utilizando los métodos Math.ceil() y Math.floor().
su valor absoluto utilizando Math.abs().
La potencia al cubo de ese número utilizando el método Math.pow().
su logaritmo natural utilizando Math.log().
suponiendo que el número representa la medida un ángulo en grados, muestra el seno y coseno de ese ángulo utilizando Math.sin() y Math.cos().

Solicita al usuario que ingrese otros dos números y calcula y muestra el mayor de los 3 (el generado y los introducidos por teclado) utilizando Math.max(). Calcula y muestra también el menos con Math.min().

Haz un programa robusto que controle las excepciones que se puedan producir.
 */

public class ClaseMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Generación de número aleatorio entre -360 y 360.
            double numAleatorio = Math.random() * 720 - 360;
            System.out.println("El número aleatorio elegido es: " + numAleatorio);

            // Raíz cuadrada
            System.out.println("La raíz cuadrada del número es: " + Math.sqrt(numAleatorio));

            // Redondeo a la cifra entera más cercana
            System.out.println("Redondeo a la cifra entera más cercana del número: " + Math.round(numAleatorio));

            // Redondeo hacia arriba y hacia abajo
            System.out.println("Redondeo tirando hacia arriba del número: " + Math.ceil(numAleatorio));
            System.out.println("Redondeo tirando hacia abajo del número: " + Math.floor(numAleatorio));

            // Valor absoluto
            System.out.println("Valor absoluto del número: " + Math.abs(numAleatorio));

            // Número al cubo
            System.out.println("Número elevado al cubo: " + Math.pow(numAleatorio, 3));

            // Logaritmo natural
            System.out.println("Logaritmo natural: " + Math.log(numAleatorio));

            // Suponiendo que el número representa la medida de un ángulo en grados
            double anguloEnRadianes = Math.toRadians(numAleatorio);
            System.out.println("Seno: " + Math.sin(anguloEnRadianes));
            System.out.println("Coseno: " + Math.cos(anguloEnRadianes));

            // ------------------------------------------------
            System.out.print("Introduce el primer número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double numero2 = sc.nextDouble();

            // Calcular y mostrar el mayor y el menor de los tres números
            double mayor = Math.max(Math.max(numAleatorio, numero1), numero2);
            double menor = Math.min(Math.min(numAleatorio, numero1), numero2);

            System.out.println("El mayor de los tres números es: " + mayor);
            System.out.println("El menor de los tres números es: " + menor);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa números válidos.");
        } finally {
            sc.close();
        }

    }
}
