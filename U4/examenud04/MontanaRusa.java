package examenud04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Test;

/*
 * Eloy Rodal Pérez
 */
public class MontanaRusa {
    public static void main(String[] args) {
        int numAlturas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de alturas de la montaña rusa");
        numAlturas = sc.nextInt();
        int[] alturas = new int[numAlturas];
        System.out.println("Introduce las cifras de las alturas");

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = sc.nextInt();
        }
        sc.close();

        int picosContados = contarPicos(alturas);
        System.out.println("La montaña rusa tiene " + picosContados + " picos en total");
    }

    public static int contarPicos(int[] alturas) {
        int numPicos = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (i == 0) {
                if (alturas[i] > alturas[i + 1] && alturas[i] > alturas[alturas.length - 1]) {
                    numPicos++;
                }
            } else if (i == alturas.length - 1) {
                if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[0])
                    numPicos++;
            } else if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1]) {
                numPicos++;
            }
        }

        return numPicos;
    }

    @Test
    public void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }
}