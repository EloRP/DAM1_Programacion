package interfacesapuntes.E0901_05;

import java.util.Arrays;
import java.util.Scanner;

public class E0905 {

    public static void main(String[] args) {

        Cola cola = new Cola() {
            Integer[] elementos = new Integer[0];

            public void encolar(Integer e) {
                Arrays.copyOf(elementos, elementos.length + 1);
                elementos[elementos.length - 1] = e;
            }

            public Integer desencolar() {
                Integer e = elementos[0];
                elementos = Arrays.copyOfRange(elementos, 1, elementos.length);
                return e;
            }
        };

        cola.encolar(1);
        cola.encolar(2);
        
        Integer numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero (negativo para terminar): ");
        numero = sc.nextInt();

        while (numero >= 0) {
            cola.encolar(numero);
            System.out.println("Escribe otro número entero: ");
            numero = sc.nextInt();
        }

        System.out.println("Cola: Salida de elementos");
        while (cola.length() > 0) {
            System.out.println(cola.desencolar());
        }



        sc.close();
    }
    }
