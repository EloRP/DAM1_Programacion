package coleccionesejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EP1220 {
    /*
     * EP1220. Utilizando colecciones, implementa la clase Supercola, que tiene como
     * atributos dos colas para enteros, en las que se encola y desencola por
     * separado. Sin embargo, si una de las colas queda vacía, al llamar a su método
     * desencolar(), se desencola de la otra mientras tenga elementos. Solo cuando
     * las dos colas estén vacías, cualquier llamada a desencolar devolverá null.
     * Escribe un programa con el menú:
     * 
     * 1. Encolar en cola1.
     * 2. Encolar en cola2.
     * 3. Desencolar de cola1.
     * 4. Desencolar de cola2.
     * 5. Salir
     * 
     * Después de cada operación se mostrará el estado de las dos colas para seguir
     * su evolución.
     */

    public static void main(String[] args) {

        Supercola supercola = new EP1220().new Supercola();
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Encolar en cola1.");
            System.out.println("2. Encolar en cola2.");
            System.out.println("3. Desencolar de cola1.");
            System.out.println("4. Desencolar de cola2.");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un número para encolar en cola1: ");
                    int inputCola1 = sc.nextInt();
                    supercola.cola1.encolar(inputCola1);
                    break;
                case 2:
                    System.out.println("Introduce un número para encolar en cola2: ");
                    int inputCola2 = sc.nextInt();
                    supercola.cola2.encolar(inputCola2);
                    break;
                case 3:
                    if (supercola.cola1.cola.size() > 0) {
                        supercola.cola1.desencolar();
                    } else {
                        System.out.println("La cola 1 está vacía.");
                    }
                    break;
                case 4:
                    if (supercola.cola2.cola.size() > 0) {
                        supercola.cola2.desencolar();
                    } else {
                        
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Cola1: " + supercola.cola1.cola);
            System.out.println("Cola2: " + supercola.cola2.cola);
        }
        sc.close();
    }

    class Supercola {

        protected Cola<Integer> cola1 = new Cola<>();
        protected Cola<Integer> cola2 = new Cola<>();

    }

    class Cola<T> {
        protected ArrayList<T> cola = new ArrayList<>();

        protected void encolar(T elemento) {
            cola.add(elemento);
        }

        protected void desencolar() {
            cola.remove(0);
        }
        }
}

