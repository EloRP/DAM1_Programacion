package buclesparaninfo;

/* EP0319. Calcula la raíz cuadrada de un número natural mediante aproximaciones.
En el caso de que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada de 23, probamos 12 = 1, 22 = 4, 32 = 9, 42 = 16, 52 = 25 (nos pasamos),
resultando 4 la raiz cuadrada de 23 con un resto (23 - 16) de 7.
 */
import java.util.Scanner;

public class EP0319 {

    public static void main(String[] args) {
        int numero, raiz, resto;
        int menor = 0;
        int mayor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número natural:");
        numero = sc.nextInt();
        sc.close();

        if (numero > 1) {
            while (mayor * mayor <= numero) {
                mayor += 1;
            }
            menor = mayor - 1;
            raiz = menor;
            resto = numero - menor * menor;

            System.out.println("La raiz de " + numero + " es " + raiz + ". Resto: " + resto);
        }
    }
}
