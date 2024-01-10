package arraysparaninfo;

import java.util.Arrays;

public class EP5013 {

        public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Tabla original: " + Arrays.toString(array));

        desordenar(array);
    }

    static void desordenar(int t[]) {
        int n = t.length;

        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
        System.out.println("Tabla desordenada: " + Arrays.toString(t));
    }
}
