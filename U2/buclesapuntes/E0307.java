package buclesapuntes;

public class E0307 {


    public static void main(String[] args) {
        System.out.println("Múltiplos de 7 menores que 100");
        for (int i = 1; i < 100; i++) { /*
                                         * para cada int i que es igual a uno, mientras i sea menor que 100, aumenta i.
                                         */
            if (i % 7 == 0) { /*
                               * dentro de este bucle, escribe todas las i que sean divisibles entre 7 con
                               * resto 0.
                               */
                System.out.println(i);
            }
        }
    }
}
