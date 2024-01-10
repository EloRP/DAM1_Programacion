package repaso_recu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Escribe el numerador de la división.");
            double numero1Division = sc.nextDouble();

            System.out.println("Escribe el denominador de la división.");
            double numero2Division = sc.nextDouble();

            System.out.println("El resultado de la división entre " + numero1Division + " y " + numero2Division + " es de: " + division(numero1Division, numero2Division));

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un valor válido.");

        } catch (ArithmeticException e) {
            System.out.println("No se permiten las divisiones entre 0.");

        } finally {
            sc.close();
        }

    }

    private static double division(double numero1Division, double numero2Division) {
        if (numero2Division == 0) {
            throw new ArithmeticException("No se permiten las divisiones entre 0.");
        } else {
            return numero1Division / numero2Division;
        }

    }
}
