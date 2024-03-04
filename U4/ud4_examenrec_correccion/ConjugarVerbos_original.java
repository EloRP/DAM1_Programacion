//ELOY RODAL PÉREZ

package examenud04rec;

import java.util.Arrays;
import java.util.Scanner;

public class ConjugarVerbos {
    final static String[] personas = { "Yo ", "Tú ", "Él/Ella/Usted ", "Nosotros/Nosotras ", "Vosotros/Vosotras ",
            "Ellos/Ellas/Ustedes " };
    // 1.-

    static String[] conjugarPresente(String verbo) {
        String[] verboConjugado = { "", "", "", "", "", "" };
        int longitudVerbo = verbo.length();
        String conjugacion = verbo.substring(longitudVerbo - 2, longitudVerbo);

        for (int i = 0; i < 6; i++) {
            if (i == 0) { // empieza en 0 al ser un array, 1º persona singular "Yo"
                verboConjugado[0] += (verbo.substring(0, longitudVerbo - 2) + "o");
            } else if (i == 1) { // 2º persona singular "Tú"
                if (conjugacion.equals("ar"))
                    verboConjugado[1] += (verbo.substring(0, longitudVerbo - 2) + "as");
                else
                    verboConjugado[1] += (verbo.substring(0, longitudVerbo - 2) + "es");

            } else if (i == 2) { // 3º persona singular "Él/Ella/Usted"
                if (conjugacion.equals("ar"))
                    verboConjugado[2] += (verbo.substring(0, longitudVerbo - 2) + "a");
                else
                    verboConjugado[2] += (verbo.substring(0, longitudVerbo - 2) + "e");

            } else if (i == 3) { // 1º persona plural "Nosotros/Nosotras"
                verboConjugado[3] += (verbo.substring(0, longitudVerbo - 1) + "mos");

            } else if (i == 4) { // 2º persona plural "Vosotros/Vosotras"
                if (conjugacion.equals("er"))
                    verboConjugado[4] += (verbo.substring(0, longitudVerbo - 2) + "éis");
                else
                    verboConjugado[4] += (verbo.substring(0, longitudVerbo - 2) + "áis");
            } else if (i == 5) { // 3º persona plural "Ellos/Ellas/Ustedes"
                if (conjugacion.equals("ir"))
                    verboConjugado[5] += (verbo.substring(0, longitudVerbo - 2) + "en");
                else
                    verboConjugado[5] += (verbo.substring(0, longitudVerbo - 1) + "n");
            }
        }
        System.out.println(Arrays.toString(verboConjugado));
        return verboConjugado;
        // TODO: FALTA ARREGLAR MÉTODO CON TILDES Y LETRAS.
    }

    // 2.-

    public static String[] impresionPresente(String verbo) {
        // TODO: ARREGLAR INPUT EN CASO DE FALTA DE CONJUGACION
        int longitudVerbo = verbo.length();
        String conjugacion = verbo.substring(longitudVerbo - 2, longitudVerbo);

        for (int i = 0; i < 6; i++) {
            System.out.print(personas[i]);
            if (i == 0) { // empieza en 0 al ser un array, 1º persona singular "Yo"
                System.out.println(verbo.substring(0, longitudVerbo - 2) + "o");
            } else if (i == 1) { // 2º persona singular "Tú"
                if (conjugacion.equals("ar"))
                    System.out.println(verbo.substring(0, longitudVerbo - 2) + "as");
                else
                    System.out.println(verbo.substring(0, longitudVerbo - 2) + "es");
            } else if (i == 2) { // 3º persona singular "Él/Ella/Usted"
                if (conjugacion.equals("ar"))
                    System.out.println(verbo.substring(0, longitudVerbo - 2) + "a");
                else
                    System.out.println(verbo.substring(0, longitudVerbo - 2) + "e");
            } else if (i == 3) { // 1º persona plural "Nosotros/Nosotras"
                System.out.println(verbo.substring(0, longitudVerbo - 1) + "mos");
            } else if (i == 4) { // 2º persona plural "Vosotros/Vosotras"
                if (conjugacion.equals("ir"))
                    System.out.println(verbo.substring(0, longitudVerbo - 1) + "s");
                else
                    System.out.println(verbo.substring(0, longitudVerbo - 1) + "is");
            } else if (i == 5) { // 3º persona plural "Ellos/Ellas/Ustedes"
                if (conjugacion.equals("ir"))
                    System.out.println(verbo.substring(0, longitudVerbo - 2) + "en");
                System.out.println(verbo.substring(0, longitudVerbo - 1) + "n");
            }
        }
        return personas;
    }

    // 3.-
    static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal) {
        int longitudVerbo = verbo.length();
        String terminacion = verbo.substring(longitudVerbo - 2, longitudVerbo);
        String[] verboConjugado = { "", "", "", "", "", "" };
        if (tiempoVerbal == "Presente simple") {
            conjugarPresente(verbo); // he reutilizado el método ya hecho.
        } else if (tiempoVerbal == "Pretérito perfecto simple") {
            for (int i = 0; i < 6; i++) {
                System.out.print(personas[i]);
                if (i == 0) {
                    if (terminacion.equals("ar"))
                        verboConjugado[0] += (verbo.substring(0, longitudVerbo - 2) + "é");
                    else
                        verboConjugado[0] += (verbo.substring(0, longitudVerbo - 2) + "í");

                } else if (i == 1) {
                    if (terminacion.equals("ar"))
                        verboConjugado[1] += (verbo.substring(0, longitudVerbo - 1) + "ste");
                    else if (terminacion.equals("er"))
                        verboConjugado[1] += (verbo.substring(0, longitudVerbo - 2) + "iste");
                    else
                        verboConjugado[1] += (verbo.substring(0, longitudVerbo - 1) + "ste");

                } else if (i == 2) {
                    if (terminacion.equals("ar"))
                        verboConjugado[2] += (verbo.substring(0, longitudVerbo - 2) + "ó");
                    else if (terminacion.equals("er"))
                        verboConjugado[2] += (verbo.substring(0, longitudVerbo - 2) + "ió");
                    else
                        verboConjugado[2] += (verbo.substring(0, longitudVerbo - 1) + "ó");

                } else if (i == 3) {
                    if (terminacion.equals("ar"))
                        verboConjugado[3] += (verbo.substring(0, longitudVerbo - 1) + "mos");
                    else if (terminacion.equals("er"))
                        verboConjugado[3] += (verbo.substring(0, longitudVerbo - 2) + "imos");
                    else
                        verboConjugado[3] += (verbo.substring(0, longitudVerbo - 1) + "mos");

                } else if (i == 4) {
                    if (terminacion.equals("ar"))
                        verboConjugado[4] += (verbo.substring(0, longitudVerbo - 1) + "steis");
                    else if (terminacion.equals("er"))
                        verboConjugado[4] += (verbo.substring(0, longitudVerbo - 2) + "isteis");
                    else
                        verboConjugado[4] += (verbo.substring(0, longitudVerbo - 1) + "steis");

                } else if (i == 5) {
                    if (terminacion.equals("ar"))
                        verboConjugado[5] += (verbo + "on");
                    else if (terminacion.equals("er"))
                        verboConjugado[5] += (verbo.substring(0, longitudVerbo - 2) + "ieron");
                    else
                        verboConjugado[5] += (verbo.substring(0, longitudVerbo - 1) + "eron");
                }
            }
        } else if (tiempoVerbal == "Futuro simple") {
            final String[] terminacionesFuturo = { "e", "as", "a", "emos", "eis", "an" }; // Ya que son todas iguales se
                                                                                          // puede simplificar esta
                                                                                          // parte del método.
            for (int i = 0; i < 6; i++)
                verboConjugado[i] += (personas[i] + verbo + terminacionesFuturo[i]);
        }
        return verboConjugado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conjugación de tiempo verbal.\n");
        System.out.println("Introduce un verbo en infinitivo de cualquiera de las tres conjugaciones (-ar, -er, -ir)");
        String verbo = sc.nextLine();
        impresionPresente(verbo);
        conjugarPresente("hablar");
        conjugarTiempoVerbal("hablar", "Presente simple");
    }
}
