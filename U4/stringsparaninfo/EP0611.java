package stringsparaninfo;

public class EP0611 {
    public static void main(String[] args) {
        char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
        char[] conjunto2 = "pviumterkqs".toCharArray();

        String palabra = "Guebos";

        String palabraCodificada = codifica(conjunto1, conjunto2, palabra);

        String palabraDescodificada = descodifica(conjunto1, conjunto2, palabraCodificada);
        System.out.println(palabraCodificada);
        System.out.println(palabraDescodificada);
    }

    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra) {
        String res = "";

        for (int i = 0; i < palabra.length(); i++) {
            res += codifica(conjunto1, conjunto2, palabra.charAt(i));
        }

        return res;
    }

    public static char codifica(char conjunto1[], char conjunto2[], char c) {
        char ch = ' ';
        int pos = String.valueOf(conjunto1).indexOf(Character.toLowerCase(c)); // tolowercase convierte a minúsc.

        if (pos == -1) {
            ch = c;
        } else {
            ch = conjunto2[pos];
        }
        return ch;
    }

    // DESCODIFICADOR
    public static String descodifica(char[] conjunto1, char[] conjunto2, String palabra) {
        String res = "";

        for (int i = 0; i < palabra.length(); i++) {
            res += codifica(conjunto2, conjunto1, palabra.charAt(i));
        }

        return res;
    }

    public static char descodifica(char conjunto1[], char conjunto2[], char c) {
        char ch = ' ';
        int pos = String.valueOf(conjunto2).indexOf(Character.toLowerCase(c)); // tolowercase convierte a minúsc.

        if (pos == -1) {
            ch = c;
        } else {
            ch = conjunto1[pos];
        }
        return ch;
    }
}
