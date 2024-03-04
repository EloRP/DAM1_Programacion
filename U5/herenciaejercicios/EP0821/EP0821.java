package herenciaejercicios.EP0821;

public class EP0821 {
    static boolean esNumero(Object ob) {
        boolean esNumerico;

        if (ob instanceof Long || ob instanceof Double || ob instanceof Integer || ob instanceof Float) {
            esNumerico = false;
        } else {
            esNumerico = true;
        }
        return esNumerico;
    }

    static boolean sumar (Object a, Object b) {
        if (a instanceof Double && b instanceof Double ) {
            double suma = (Double) a + (Double) b;
        } else if (a instanceof String && b instanceof String ) {
            String concatenarCadenas = (a += b);
        }

    }
}
