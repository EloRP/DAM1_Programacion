package clasesejercicios.EP0713;

import java.util.Arrays;

/*EP0713. En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el problema de elegir la paleta de colores que vamos a utilizar en nuestra decoración. Existe una solución, algo atrevida, que consiste en utilizar colores al azar.
* Diseña la clase Colores, que alberga por defecto una serie de colores (mediante una cadena), aunque es posible añadir tantos como necesitemos. La clase tendrá un método que devuelve una tabla con los n colores que necesitemos elegidos al azar sin repeticiones. */
public class Colores {
    static String[] colores = { "azul", "rojo", "verde" };

    public static void anhadirColores(String nuevoColor) {
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = nuevoColor;
    }

    public static String[] conseguirColores(int num) {
        String[] listado;

        if (num >= colores.length) {
            throw new IllegalArgumentException("El array de colores no dispone de tantos colores.");
        }

        do {
            desordenar(colores);
            listado = new String[num];
            System.arraycopy(colores, 0, listado, 0, num);
        } while (coloresIguales(listado));

        return listado;
    }

    private static boolean coloresIguales(String[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i != j && t[i].equalsIgnoreCase(t[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void desordenar(String[] t) {
        for (int i = 0; i < t.length; i++) {
            int pos = (int) (Math.random() * t.length);
            String ch = t[i];
            t[i] = t[pos];
            t[pos] = ch;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(colores));
        anhadirColores("azul");
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(conseguirColores(2)));
    }
}