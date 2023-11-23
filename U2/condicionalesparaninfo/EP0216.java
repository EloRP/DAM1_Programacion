package condicionalesparaninfo;

/* EP0216. Utiliza el operador ternario para calcular
el valor absoluto de un número que se solicita al usuario por teclado. */
import java.util.Scanner;

public class EP0216 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        sc.close();

        System.out.println("El valor absoluto de " + numero + " es " + (numero > 0 ? numero : -numero) + ".");
    }
}
