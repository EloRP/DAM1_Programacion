package stringsparaninfo;

public class EP0618 {
    public static void main(String[] args) {
        String fraseTest = "Viaje antes que destino";
        System.out.println(convertirCamelCase(fraseTest));
    }

    public static String convertirCamelCase(String frase) {
        String[] palabras = frase.split(" ");
        String resultado = palabras[0].toLowerCase();
        for (int i = 1; i < palabras.length; i++) {     //Si se pone 0, se repite la primera palabra porque se espera que empiece por ahí.
            if (!frase.isEmpty()) {
                String camelCase = palabras[i].substring(0, 1).toUpperCase();
                resultado += camelCase + palabras[i].substring(1).toLowerCase();
            }
        }
        return resultado;
    }
}
