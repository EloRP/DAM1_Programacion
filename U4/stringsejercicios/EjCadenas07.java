package stringsejercicios;

public class EjCadenas07 {
    static String invertirCadena(String cad) {
        String cadInvertida = "";

        for (int i = cad.length() - 1; i >= 0; i--) {
            cadInvertida += cad.charAt(i);
        }

        return cadInvertida;
    }
}
