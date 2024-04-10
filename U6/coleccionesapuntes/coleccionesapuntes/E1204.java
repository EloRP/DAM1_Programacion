package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class E1204 {
    /*
     * Implementar una aplicación que pida por consola números enteros no negativos
     * hasta que se introduce un -1. Los números se irán insertando en una
     * colección, pudiéndose repetir. Al terminar, se mostrará la colección por
     * pantalla.
     * A continuación, se mostrarán todos los valores pares. Por último, se
     * eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección
     * resultante.
     * Practica el uso de iteradores y bucles for-each para recorrer la colección.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> listaNums = new ArrayList<>();
        System.out.println("Introduce un número entero no negativo (o -1 para terminar):");
        int n = sc.nextInt();

        while (n != -1) {
            listaNums.add(n);
            n = sc.nextInt();
        }
        sc.close();
        System.out.println("Colección de números: " + listaNums);

        System.out.println("Números pares:");
        for (Integer num : listaNums)
            if (num % 2 == 0)
                System.out.print(num + " ");

        System.out.println("\nNúmeros pares (con iterador):");

        Iterator<Integer> it = listaNums.iterator();

        while (it.hasNext()) {
            Integer num2 = it.next();
            // listaNums.remove(num2); ERROR: MODIFICO LA COLECCIÓN CON MÉTODOS AJENOS AL
            // ITERADOR
            if (num2 % 2 == 0)
                System.out.print(num2 + " ");
        }
        System.out.println("\nEliminar múltiplos de 3:");
        it = listaNums.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 3 == 0)
                it.remove();
        }
        System.out.println(listaNums);
    }
}
