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
        boolean realizarSuma = false;
        if (a instanceof Double && b instanceof Double ) {
            double suma = (Double) a + (Double) b;
            System.out.println(suma);
            realizarSuma = true;
        } else if (a instanceof String && b instanceof String ) {
            String concatenarCadenas = (String) a + (String) b;
            System.out.println(concatenarCadenas);
            realizarSuma = true;
        } else {
            System.out.println("No sumables");
        }
        return realizarSuma;
    }
}
