package arraysparaninfo;

public class EP5020Prof {
    public static void main(String[] args) {
    }

    public static int[] fusionOrdenada(int[] t1, int[] t2) {
        int[] tr = null;

        if (t1 != null && t2 != null) {
            tr = new int[t1.length + t2.length];

            int i = 0, j = 0, k = 0;

            // Compara y copia elementos de los dos arrays hasta que se termina uno de
            // ellos.
            while (i < t1.length && j < t2.length) {
                if (t1[i] <= t2[j]) {
                    tr[k] = t1[i];
                    i++;
                    k++;
                } else {
                    tr[k] = t2[j];
                    j++;

                }
                k++;
            }

            // Copia los elementos restantes del array que no se ha terminado aún
            if (i == t1.length) {
                // Copio t2
                System.arraycopy(t2, j, tr, k, tr.length - k + 1);
            } else {
                // Copio t1
                System.arraycopy(t1, i, tr, k, tr.length - k + 1);
            }
        }
        return tr;
    }
}