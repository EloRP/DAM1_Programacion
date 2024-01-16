package simud0401;

import java.util.Arrays;
import java.util.Scanner;

public class Abadias {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int altura;
        int[] alturas = new int[0];
        int[] cimasAbadias;

        System.out.println("Introduce las alturas de las montañas de la cordillera (en metros y sin decimales, -1 para terminar)");
        altura = sc.nextInt();

        while (altura >= 0 && alturas.length < 1000) {
            
        }
    }

    static int[] cimasAbadias(int [] t) {
        int[] cimasAbadias;

        if (t == null ||t.length == 0) {
            cimasAbadias = new int[0];
        } else {
            cimasAbadias = new int[1];
            cimasAbadias[0] = t.length;
            int alturaMax = t[t.length - 1];
        
            for (int i = t.length - 2; i >= 0; i--) {
                if (t[i] > alturaMax) {
                    alturaMax = t[i];
                    cimasAbadias = Arrays.copyOf(cimasAbadias, cimasAbadias.length + 1);
                    cimasAbadias[cimasAbadias.length - 1] = i + 1;
                }
            }
        
        }
        
        Arrays.sort(cimasAbadias);

        return cimasAbadias;
    }
}