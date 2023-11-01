// Eloy Rodal Pérez (Driver) , Gonzalo Rodríguez Aguilar (Navigator)

package pairprogramming;
import java.util.Scanner;
public class RecetasIngredientes {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    byte numPer;
    double gManz1Per = 1500 / 6;
    byte mlAgua1Per = 330 / 6;
    double gAzucar1per = 120 / 6;
    double mlZumo1per = 5.0 / 6;
    //hemos puesto 5 ml porque la mayoría de resultados de búsqueda lo especificaban.

    System.out.println("Receta de compota de manzana: " + "https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");
    
    System.out.println("Receta para 6 personas.");
    System.out.println("Los ingredientes (para 6) son: ");
    System.out.println("1 kg y medio de manzanas");
    System.out.println("330 ml de agua");
    System.out.println("120 g de azúcar (blanco o moreno)");
    System.out.println("Una cucharadita de zumo de limón");
    System.out.println("La piel sin el blanco de una naranja");
    System.out.println("1 ramita de canela");

    System.out.println("Indica el número de personas para las que quieras preparar esta receta:");
    numPer = sc.nextByte();
    
    System.out.println("Gramos de manzanas: " + (gManz1Per) * numPer + " g");
    System.out.println("Mililitros de agua: " + (mlAgua1Per) * numPer + " ml");
    System.out.println("Gramos de azúcar: " + (gAzucar1per) * numPer + " g");
    System.out.println("Militros de zumo de limón: " + Math.round ((mlZumo1per) * numPer) + " ml");

    System.out.println("El precio de la cantidad de manzanas para las personas que has indicado es de: " + Math.round ((gManz1Per * numPer / 1000) * 1.65) + " euros");
    System.out.println("El precio de la cantidad de azúcar para las personas que has indicado es de: " + ((gAzucar1per * numPer / 1000) * 1.49) + " euros");

    /*1.65€ 1000 g manzana
    1.49€  1000 g azucar*/
    




    sc.close();
    }
}
