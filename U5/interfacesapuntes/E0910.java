package interfacesapuntes;

import java.util.Arrays;
import java.util.Comparator;

public class E0910 {
    public static void main(String[] args) {
        Comparator ordenNaturalInverso = Comparator.reverseOrder();
        Comparator ordenNaturalInverso2 = Comparator.naturalOrder().reversed();
        Comparator ordenNatural = Comparator.naturalOrder();
        Integer[] numeros = new Integer[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        Arrays.sort(numeros, ordenNaturalInverso);

        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(numeros, ordenNatural);

        System.out.println(Arrays.toString(numeros));
    }
}
