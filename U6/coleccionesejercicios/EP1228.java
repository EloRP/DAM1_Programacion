package coleccionesejercicios;

import java.util.ArrayList;
import java.util.List;

public class EP1228 {
    /* @author Eloy Rodal Pérez
     * EP1228. Implementa la función uneCadenas, con el siguiente prototipo:
     * 
     * List<Character> uneCadenas(List<Character> cad1, List<Character> cad2)
     * 
     * que devuelve una lista con la concatenación de cad1 y cad2.
     */

    public static void main(String[] args) {
        
        List<Character> cad1 = new ArrayList<>();
        List<Character> cad2 = new ArrayList<>();
        
        cad1.add('a');
        cad1.add('b');
        cad1.add('c');

        System.out.println(cad1);
        
        cad2.add('d');
        cad2.add('e');
        cad2.add('f');
        
        System.out.println(cad2);

        System.out.println(uneCadenas(cad1, cad2));

    }
    
    public static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        List<Character> listaConcatenada = new ArrayList<>();
        
        listaConcatenada.addAll(cad1);
        listaConcatenada.addAll(cad2);
        
        return listaConcatenada;
    }
}
