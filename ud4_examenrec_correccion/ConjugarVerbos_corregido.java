//ELOY RODAL PÉREZ
// CORRECCIÓN EJ. 3
package ud4_examenrec_correccion;

import java.util.Scanner;

public class ConjugarVerbos_corregido {
    static final String[] presenteAr = { "o", "as", "a", "amos", "áis", "an" }; //Se emplean arrays para almacenar las conjugaciones de cada verbo.
    static final String[] presenteEr = { "o", "es", "e", "emos", "éis", "en" };
    static final String[] presenteIr = { "o", "es", "e", "imos", "ís", "en" };
    
    // 1.-
    static String[] conjugarPresente(String verbo) {
        String conjugacion = verbo.substring(verbo.length() - 2, verbo.length());
        String raizVerbo = (verbo.substring(0, verbo.length() - 2));
        String[] verboConjugado = new String[6];

        switch (conjugacion) {  //He hecho un switch con cada conjugación como caso
            case "ar":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + presenteAr[i];
                }
                break;
            case "er":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + presenteEr[i];
                }
                break;
            case "ir":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + presenteIr[i];
                }
                break;
            default:
                verboConjugado = null;  //y un default en caso de que el usuario introduzca una entrada que no sea un verbo.
                break;
        }
        return verboConjugado;
    }

    // 3.-  He implementado los tiempos verbales en métodos aparte para hacer el código más legible. Se basan todos en el primero.
    static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal) {
        String[] verboConjugado = new String[6];

        switch (tiempoVerbal) {
            case "Presente simple":
                verboConjugado = conjugarPresente(verbo);
                break;
            case "Pretérito perfecto simple":
                verboConjugado = conjugarPreterito(verbo);
                break;
            case "Futuro simple":
                verboConjugado = conjugarFuturo(verbo);
                break;
            default:
                verboConjugado = null;
                break;

        }
        return verboConjugado;
    }

    static String[] conjugarPreterito(String verbo) {
        String[] pasadoAr = { "é", "aste", "ó", "amos", "ásteis", "aron" };
        String[] pasadoErIr = { "í", "iste", "ió", "imos", "ísteis", "ieron" };

        String conjugacion = verbo.substring(verbo.length() - 2, verbo.length());
        String raizVerbo = (verbo.substring(0, verbo.length() - 2));
        String[] verboConjugado = new String[6];

        switch (conjugacion) {
            case "ar":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + pasadoAr[i];
                }
                break;
            case "er":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + pasadoErIr[i];
                }
                break;
            case "ir":
                for (int i = 0; i < verboConjugado.length; i++) {
                    verboConjugado[i] = (raizVerbo) + pasadoErIr[i];
                }
                break;
            default:
                verboConjugado = null;
                break;
        }
        return verboConjugado;
    }

    static String[] conjugarFuturo(String verbo) {
        String[] futuro = { "é", "ás", "á", "emos", "éis", "án" };
        String[] verboConjugado = new String[6];

        if (!(verbo.endsWith("ar") || verbo.endsWith("er") || verbo.endsWith("ir"))) {
            verboConjugado = null;  //Al no ser un switch, se recurre a un endsWith para filtrar palabras que no sean verbos.
        } else {
            for (int i = 0; i < verboConjugado.length; i++) {
                verboConjugado[i] = (verbo) + futuro[i];
            }
        }
        return verboConjugado;
    }

    //2.- Main donde se implementa el segundo ejercicio.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] personas = { "Yo ", "Tú ", "Él/Ella/Usted ", "Nosotros/Nosotras ", "Vosotros/Vosotras ",
                "Ellos/Ellas/Ustedes " };   //Array con las personas, añadidas al principio de cada sout.
        String[] conjugacion;
        System.out.println("Conjugación de tiempo verbal.\n");
        System.out.println("Introduce un verbo en infinitivo de cualquiera de las tres conjugaciones (-ar, -er, -ir)");
        String verbo = sc.nextLine();

        while (!verbo.equals("fin")) {  //Bucle para implementar una entrada infinita hasta que el usuario escriba "fin".
            conjugacion = conjugarPresente(verbo);
            for (int i = 0; i < personas.length; i++) {
                System.out.println(personas[i] + conjugacion[i]);
            }

            verbo = sc.nextLine();
        }


        sc.close();
    }
}
