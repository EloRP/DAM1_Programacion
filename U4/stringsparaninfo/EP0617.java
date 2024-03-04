package stringsparaninfo;

public class EP0617 {
    public static void main(String[] args) {
        String palabra = "destornillador";
        int longitudSecuencia = 4;
        secuenciasCaracteres(palabra, longitudSecuencia);
    }

    public static void secuenciasCaracteres(String palabra, int longitud) {
        for (int i = 0; i < palabra.length(); i += longitud) {
            int indiceFinal = Math.min(i + longitud, palabra.length()); // primer caso, o 4 o 14. elige 4.
            String secuenciaModificada = palabra.substring(i, indiceFinal); // escribe lo que hay en el substring del 0 al 4º caracter.
            System.out.println(secuenciaModificada);
        }

    }
}
