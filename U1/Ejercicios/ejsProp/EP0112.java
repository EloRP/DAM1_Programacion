package ejsProp;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
    // Declaración de variables y constantes
    final int NUM_MODULO = 7;
    int numero, resultado;
        
    Scanner entrada = new Scanner(System.in);
                
    // Entrada de datos
    System.out.print("Introduce un número entero: ");
    numero = entrada.nextInt();

    // Proceso
    resultado = numero % NUM_MODULO == 0 ? 0 : NUM_MODULO - numero % NUM_MODULO;
        
    // Salida
    System.out.println("El número que hay que sumar para que sea múltiplo de " + NUM_MODULO 
            + " es: " + resultado);
}

    
}
