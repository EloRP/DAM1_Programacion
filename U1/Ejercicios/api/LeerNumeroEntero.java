package api;
import java.util.Scanner;
public class LeerNumeroEntero {
  
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int varByte;
    System.out.println("Escribe un dato de tipo byte: ");
    varByte = sc.nextInt();
    System.out.println("Has introducido el valor " + varByte + " el cual es correcto");
        

    sc.close();
    }
}
