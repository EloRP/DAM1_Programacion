package arraysejercicios;

import java.util.Scanner;

public class EjArrays11 {
    public static char[][] leerMovimiento(char[][] tablero) {
        int cont = 0;
        int fila = 0, columna = 0;
        Scanner sc = new Scanner(System.in);
        if (cont % 2 == 0) { // JUGADOR 1
            System.out.println("Jugador 1 introduce la casilla en la que quieres insertar tu token del 3 en raya");

            System.out.println("Introduce la fila en la que quieres insertar tu token");

            do {
                fila = sc.nextInt();
                if (fila < 0 || fila > 2) {
                    System.out.println(
                            "La fila no entra dentro del rango, la primera fila es la '0' y la ultima es la '2' ");
                }
            } while (fila >= 0 && fila <= 2);

            System.out.println("Introduce la columna en la que quieres insertar tu token");

            do {
                columna = sc.nextInt();
                if (columna < 0 || columna > 2) {
                    System.out.println(
                            "La columna no entra dentro del rango, la primera fila es la '0' y la ultima es la '2' ");
                }
            } while (columna >= 0 && columna <= 2);

            tablero[fila][columna] = 'X';
            sc.close();

            return tablero;
        }

        else {
            System.out.println("Jugador 2 introduce la casilla en la que quieres insertar tu token del 3 en raya");
            System.out.println("Introduce la fila en la que quieres insertar tu token");
            do {
                fila = sc.nextInt();
                if (fila < 0 || fila > 2) {
                    System.out.println(
                            "La fila no entra dentro del rango, la primera fila es la '0' y la ultima es la '2' ");
                }
            } while (fila >= 0 && fila <= 2);
            System.out.println("Introduce la columna en la que quieres insertar tu token");
            do {
                columna = sc.nextInt();
                if (columna < 0 || columna > 2) {
                    System.out.println(
                            "La columna no entra dentro del rango, la primera fila es la '0' y la ultima es la '2' ");
                }
            } while (columna >= 0 && columna <= 2);
            tablero[fila][columna] = 'O';
            sc.close();
            return tablero;

        }
    }
}
