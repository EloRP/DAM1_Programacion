package pruebitas;
import java.util.Scanner;
public class ejemplo_if {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un dato tipo byte");
    Short n;
    n = sc.nextShort();
    if (n > 127) {System.out.println("Tremendo pendejo");}
    
    else { if (n >= -127) {System.out.println("Bien hecho");}
    if (n < -127) {System.out.println("Tremendo pendejo");}
    }
    sc.close();
    }
    
    }