package funcionesparaninfo;

/*
 * EP0413. Crea la función muestraPares(int n) que muestre por consola los primeros n números pares.
 */
public class EP0413 {
    public static void main(String[] args) {
        int n = 10;
        muestraPares(n);
    }

    static void muestraPares(int n) {
        if (n < 1) {
            System.out.println("El valor de n debe ser mayor o igual que 1.");
            return;
        }

        int contador = 1;
        int numero = 2;

        while (contador <= n) {
            System.out.println(numero);
            contador++;
            numero += 2;
        }
    }
}
