package funcionesapuntes;
import java.util.Scanner;
public class Pruebas4 {
    public static void main(String[] args) {
        System.out.println("Escribe un numero x para 100/x: ");

        try{
            int n = new Scanner(System.in).nextInt();
            System.out.println("Intentando division...");
            System.out.println(3/n);
            //Otro código
        } catch (ArithmeticException e) {
            // handle exception
            System.out.println("No se puede dividir entre 0.");
        } catch (Exception e) {
            System.out.println("Se ha producido algun error.");
        }
        }
    }

