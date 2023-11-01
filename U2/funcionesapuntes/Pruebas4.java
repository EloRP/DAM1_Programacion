package funcionesapuntes;
import java.util.Scanner;
public class Pruebas4 {
    public static void main(String[] args) {
        System.out.println("Escribe un número x para 100/x: ");

        try{
            int n = new Scanner(System.in).nextInt();
            System.out.println("Intentando división...");
            System.out.println(3/n);
            //Otro código
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("El dato introducido no es un número entero.");
        } catch (Exception e) {
            System.out.println("Se ha producido algún error.");
        }
        }
    }

