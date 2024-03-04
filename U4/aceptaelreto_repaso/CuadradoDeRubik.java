package aceptaelreto_repaso;

import java.util.Scanner;

public class CuadradoDeRubik {

    public static void main(String[] args) {
        char[][] cubo = crearLado();
        cubo = rellenarLado(cubo);
        cubo = listaOperaciones(cubo);

    }

    private static void mostrar(char[][] cubo) {
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo.length; j++) {
                System.out.println(cubo[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] listaOperaciones(char[][] cubo) {
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        char instruccion = letra.nextLine().charAt(0);

        while (instruccion != 'x') {
            int operacion = num.nextInt();
            if (Math.abs(operacion) < 1 || Math.abs(operacion) > cubo.length) {
                throw new IllegalArgumentException("Operación inválida");
            }

            if (instruccion == 'f') {
                if (operacion > 0) {
                    char ultValor = cubo[operacion - 1][cubo.length - 1];
                    for (int i = cubo.length - 1; i >= 1; i--) {
                        cubo[operacion - 1][i] = cubo[operacion - 1][i - 1];
                    }
                    cubo[operacion - 1][0] = ultValor;
                } else {
                    operacion = Math.abs(operacion);
                    char primValor = cubo[operacion - 1][0];
                    for (int i = cubo.length - 1; i >= 1; i--) {
                        cubo[operacion - 1][i] = cubo[operacion - 1][i - 1];
                    }
                    cubo[operacion - 1][cubo.length - 1] = primValor;

                }
            } else if (instruccion == 'c') {

            } else {
                throw new IllegalArgumentException("Instrucción introducida no válida");
            }

            instruccion =  letra.nextLine(),charAt(0);
        }
        return cubo;
    }

    private static char[][] procesarInstruccionColumna(char[][] cubo, int operacion) {
        if (operacion > 0) {
            char primValor = cubo[0][0];
            for (int i = cubo.length - 2; i >= 1; i--) {
                cubo[operacion - i][0] = cubo[operacion - i][0];
            }
            cubo[0][0] = primValor;
        }
    }

    private static char[][] procesarInstruccionFila(char[][] cubo, int operacion) {
        if (operacion > 0) {
            char ultValor = cubo[operacion - 1][cubo.length - 1];
            for (int i = cubo.length - 1; i >= 1; i--) {
                cubo[operacion - 1][i] = cubo[operacion - 1][i - 1];
            }
            cubo[operacion - 1][0] = ultValor;
        } else {
            operacion = Math.abs(operacion);
            char primValor = cubo[operacion - 1][0];
            for (int i = 0; i < cubo.length - 1; i++) {
                cubo[operacion - 1][i] = cubo[operacion - 1][i + 1];
            }
            cubo[operacion - 1][cubo.length - 1] = primValor;
        }
        return cubo;
    }

    private static char[][] crearLado() {
        Scanner sc = new Scanner(System.in);

    }
}
