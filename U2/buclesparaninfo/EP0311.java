package buclesparaninfo;

/* EP0311. Realiza un programa que convierta un número entero decimal en su representación binaria.
Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea.
 */
import java.util.Scanner;

public class EP0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long entero;
        System.out.println("Introduce un número entero:");
        entero = sc.nextLong();
        sc.close();
        if (entero == 0) {
            System.out.println("0");
        } else {
            while (entero != 0) {
                long bit = entero % 2;
                System.out.println(bit);
                entero = entero / 2;
            }
        }
    }
}
