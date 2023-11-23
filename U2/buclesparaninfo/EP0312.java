package buclesparaninfo;

/* EP0312. Modifica el programa anterior (EP0311) para que el usuario pueda introducir un número en binario y el programa muestre su conversión a decimal. */

import java.util.Scanner;

public class EP0312 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String binario;
        long decimal = 0;
        long potencia = 1;

        System.out.println("Introduce un número en binario:");
        binario = sc.nextLine();
        sc.close();

        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);
            if (bit == '1') {
                decimal += potencia;
            }
            potencia *= 2;
        }

        System.out.println("El número decimal equivalente es: " + decimal);
    }
}
