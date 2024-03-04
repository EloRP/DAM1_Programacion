import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicasExplicaciones {
    public static void main(String[] args) {
        int alturaMontaña;
        int[] alturas = new int[0];
        int[] cimas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Abadías pirenaicas.");
        System.out.println("Introduce la altura de las montañas. La entrada terminará al superar las 1000 montañas o al introducir un núm. negativo.");
        alturaMontaña = sc.nextInt();
        
        while (alturaMontaña > 0 && alturas.length < 1000) {
            alturas = Arrays.copyOf(alturas, alturas.length + 1);       //alturas se convierte en una copia de sí mismo con una longitud de 1 para añadir la altura de la montaña actual
            alturas[alturas.length - 1] = alturaMontaña;    //alturaMontaña se sitúa en el último lugar del array de alturas. (alturas.length - 1) es la última posición de este.
            alturaMontaña = sc.nextInt();
        }
        sc.close();
        cimas = cimasAbadias(alturas);

        System.out.println("Número de abadías: " + cimas.length);
        System.out.println("Orden de cimas en las que se puede construir, desde el oeste: " + Arrays.toString(cimas));
        //El sol sale desde el este y se pone por el oeste. Si hay montañas altas hacia el este, no se cuenta esa montaña en concreto.
        //<--- oeste / este ---->
    }

    public static int[] cimasAbadias (int[] t) {
        int[] cimasAbadias;

        if (t == null || t.length == 0) {
            cimasAbadias = new int[0];      //Si el array es nulo o si tiene longitud 0, se crea un array vacío.
        } else {
            cimasAbadias = new int[1];
            cimasAbadias[0] = t.length;    //se crea un array nuevo que tiene un solo hueco, que contiene la cantidad de abadías que tenga t. O sea, si t tiene 5 abadías distintas, se muestra 5.
            int alturaMax = t[t.length - 1];    //almacena la altura más alta en la última posición del array t.
        
            for (int i = t.length - 2; i > 0; i--) {    //i es de la longitud de t menos dos, i es mayor que 0, se resta i de 1 en 1.
                if (t[i] > alturaMax) {     //si la posición actual de t es mayor que la altura máxima registrada
                    alturaMax = t[i];       //ese valor se convierte en la altura máxima
                    cimasAbadias = Arrays.copyOf(cimasAbadias, cimasAbadias.length + 1);    //creando así una nueva cumbre
                    cimasAbadias[cimasAbadias.length - 1] = i + 1;      //el número de la abadía se añade al final del array cimasAbadias, añadiéndole un 1 porque el array empieza en 0.
                }
            }
        }
        Arrays.sort(cimasAbadias); //ordenamos cimasAbadias
        return cimasAbadias;
    }
}
