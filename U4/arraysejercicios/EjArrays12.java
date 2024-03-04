package arraysejercicios;

public class EjArrays12 {
    public static void main(String[] args) {
        int[][] t = crearMatrizIdentidad(3);
        System.out.println(esMatrizValida(t));
        System.out.println(comprobarMatrizIdentidad(t));
    }

    public static Boolean comprobarMatrizIdentidad(int[][] n) {
        boolean esIdentidad = false;
        
        for (int i = 0; i < n.length; i++) {
            if (n[i][i] == 1) {
                esIdentidad = true;
            } else {
                esIdentidad = false;
                break;
            }
        }
    return esIdentidad;
    }
        
    

    public static Boolean esMatrizValida(int[][] t) {
        return t != null && t.length > 0 && t[0].length > 0;
    }

    public static int[][] crearMatrizIdentidad(int n) {
        int[][] t = null;

        if (n > 0) {
            t = new int[n][n];

            // Arrays.fill(t, 0);

            for (int i = 0; i < n; i++) {
                t[i][i] = 1;
            }
        }

        return t;
    }
}
