package buclesparaninfo;

/* EP0320. Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone
el usuario.
La manera de especificar que no se desea introducir más cantidades es mediante el cero.
 */
import java.util.Scanner;

public class EP0320 {

    public static void main(String[] args) {

        double total = 0;
        double dinero_introducido = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dinero que tienes en todos los lugares (€). Introduce 0 para terminar:");

        while (dinero_introducido != 0) {
            dinero_introducido = sc.nextDouble();
            total = total + dinero_introducido;
        }
        sc.close();
        System.out.println("La cantidad dinero que tienes en total es de: " + total + "€.");
    }
}
