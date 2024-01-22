package arraysejercicios;

import java.util.Scanner;

public class EjArrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Introduce el sueldo de " + nombres[i] + ": ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine();
        }

        int indiceMaximoSueldo = encontrarMaximoSueldo(sueldos);

        System.out.println("El empleado que más gana es: " + nombres[indiceMaximoSueldo] +
                " con un sueldo de: " + sueldos[indiceMaximoSueldo] + " euros.");

        sc.close();
    }

    private static int encontrarMaximoSueldo(double[] sueldos) {
        int indiceMaximo = 0;
        for (int i = 1; i < sueldos.length; i++) {
            if (sueldos[i] > sueldos[indiceMaximo]) {
                indiceMaximo = i;
            }
        }
        return indiceMaximo;
    }
}
