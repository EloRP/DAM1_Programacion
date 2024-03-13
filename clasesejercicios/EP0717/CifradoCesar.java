package clasesejercicios.EP0717;
/* El cifrado César es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el código. Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto n posiciones detrás.
* Por ejemplo, para un valor de n igual a 3, la letra 1 se codifica con la d, y la letra q se codifica con la x. En el caso de que una letra exceda a la z, seguiremos de forma circular utilizando la a. Solo se cifrarán letras, mayúsculas o minúsculas.
* Realiza una clase que, mediente un método estático, devuelva cifrado el texto que se le pasa con un paso de n letras. */
public class CifradoCesar {
    public static String cifrar(String str, int n) {
        char[] caracteres = str.toCharArray();
        char[] caracteresCodificados = new char[caracteres.length];
        String cadenaCodificada = "";
        char caracterControlMayus = (char) ('Z' - n);
        char caracterControlMinus = (char) ('z' - n);

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] >= 'A' && caracteres[i] <= 'Z') {         // Compruebo si son mayúsculas
                if (caracteres[i] <= caracterControlMayus) {
                    caracteresCodificados[i] = (char) (caracteres[i] + n);
                } else {
                    int dif = (char) ('z' - caracteres[i]);
                    char cambio = (char) ('a' + (n - (dif + 1)));
                    caracteresCodificados[i] = cambio;
                }
            } else if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {  // Comprueba si son minúsculas
                if (caracteres[i] <= caracterControlMinus) {
                    caracteresCodificados[i] = (char) (caracteres[i] + n);
                } else {
                    int dif = (char) ('z' - caracteres[i]);
                    char cambio = (char) ('a' + (n - (dif + 1)));
                    caracteresCodificados[i] = cambio;
                }
            } else {                                                    // Si no son ni mayúsculas ni minúsculas, no es una letra.
                cadenaCodificada = "No es una letra.";
            }
        }
        for (int i = 0; i < caracteresCodificados.length; i++) {
            cadenaCodificada += caracteresCodificados[i];
        }
        return cadenaCodificada;
    }
    public static void main(String[] args) {
        System.out.println(cifrar("abcdefghijklmnopqrstvwxyz", 5));
    }
}