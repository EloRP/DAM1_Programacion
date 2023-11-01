package expresiones;

public class expresioneslogicas {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        boolean X = true, Y = false, Z = true;

        // Salida
        System.out.println((X && Y) || (X && Z));
        System.out.println((X || !Y) && (!X || Z));
        System.out.println(X || Y && Z);
        System.out.println(!(X || Y) && Z);
        System.out.println(X || Y || X && !Z && !Y);
        System.out.println(!X || !Y || Z && X && !Y);
    }

    
}
