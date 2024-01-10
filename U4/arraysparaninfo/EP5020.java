package arraysparaninfo;

import java.util.Arrays;

public class EP5020 {

    public static int[] fusionOrdenada(int[] t1, int[] t2) {
        int[] tr = new int[t1.length + t2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < t1.length && j < t2.length) {
            if (t1[i] < t2[j]) {
                tr[k] = t1[i];
                i++;
                k++;
            } else {
                tr[k] = t2[j];
                j++;
                k++;
            }

        Arrays.copyOf(t1, k);
        }


        return tr;

    }

    public static void main(String[] args) {
        int tr[] = new int[14];
        int t1[] = new int[8];
        int t2[] = new int[6];

        crearOrdenarArrays(t1, t2);
        System.out.println(tr);
    }

    public static int[] crearOrdenarArrays(int[] t1, int[] t2) {
        for (int i = 0; i < t1.length; i++) {
            t1[i] = (int) (Math.random() * 10 + 1);
        }
        for (int j = 0; j < t2.length; j++) {
            t2[j] = (int) (Math.random() * 10 + 1);
        }

        Arrays.sort(t1);
        Arrays.sort(t2);

        return t1;

    }
}

/*
 * while (i < t1.length && j < t2.length) {
 * if (t1[i] < t2[j]) {
 * tr[k] = t1[i];
 * i++;
 * k++;
 * } else {
 * tr[k] = t2[j];
 * j++;
 * k++;
 * }
 * }
 */