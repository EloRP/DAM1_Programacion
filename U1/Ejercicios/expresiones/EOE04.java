package expresiones;

// 4. Si x, y, z son variables de tipo double con valores x = 88, y = 3.5, z = -5.2, determina el valor de las siguientes expresiones aritméticas. Obtén el resultado de cada expresión con un máximo de cuatro decimales.


public class EOE04 {
    
    public static void main(String[] args) {
        
        //Declaración de variables

        double x = 88, y = 3.5, z = -5.2;
        
        System.out.println(x + y + z);
        System.out.println(2 * y + 3 * (x - z)); 
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x / (y + z));
        System.out.println((x / y) + z);
        System.out.println(2 * x / 3 * y);
        System.out.println(2 * x / (3 * y));
        System.out.println(x * y % z);
        System.out.println(x * (y % z));
        System.out.println(3 * x - z - 2 * x);
        System.out.println(2 * x / 5 % y);
        System.out.println(x - 100 % y % z);
        System.out.println(x - y - z * 2);
    }

}
