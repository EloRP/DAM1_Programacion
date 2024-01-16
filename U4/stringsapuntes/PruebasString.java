package stringsapuntes;
import apuntes.Persona;

public class PruebasString {
    public static void main(String[] args) {
        Persona p = new Persona("Eloy", "48912980");
        String cad = String.valueOf(p);
        String cad2 = "Eloy";
        String cad3 = "eloy";
        System.out.println(cad);
        System.out.println(cad2);
        System.out.println(cad == cad2);
        System.out.println(cad2 == cad3);
        System.out.println(cad2.equalsIgnoreCase(cad3));
        System.out.println(cad2.compareToIgnoreCase(cad3));
        System.out.println(cad.concat(cad3));
        System.out.println(cad);
    }
}
