package repo_sanchez;

import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carrilMasGrandeComun = 0;
        int auxInt = 0;
        System.out.println("introduce el numero de túneles:");
        int numPuentes = sc.nextInt();
        for (int i = 1; i < numPuentes + 1; i++) {
            System.out.println("Introduce el número de carriles del túnel " + i + ":");
            int carriles = sc.nextInt();
            for (int j = 1; j < carriles + 1; j++) {
                System.out.println("Introduce la anchura del carril " + j + " del túnel " + i + " en cm:");
                int anchura = sc.nextInt();
                if (auxInt == 0) {
                    auxInt = anchura;
                } else if (anchura > auxInt) {
                    auxInt = anchura;
                }
            }
            if (carrilMasGrandeComun == 0) {
                carrilMasGrandeComun = auxInt;
            } else if (carrilMasGrandeComun > auxInt && auxInt != 0) {
                carrilMasGrandeComun = auxInt;
            }
            auxInt = 0;
        }
        System.out.println("======================");
        System.out.println(carrilMasGrandeComun);
        sc.close();
    }

}