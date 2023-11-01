package calculosoperadores;

import java.util.Scanner;

public class E0108 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     byte edad;

     System.out.print("¿Cuántos años tienes?");
     edad = sc.nextByte();   
    
     boolean mayorEdad = (edad >= 18);

     System.out.print("¿Eres mayor de edad? " + (mayorEdad));
     sc.close();
    }
    
}
