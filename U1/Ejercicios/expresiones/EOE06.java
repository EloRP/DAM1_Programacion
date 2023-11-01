package expresiones;

// 6. Si W, X, Y y Z son variables de tipo boolean con valores W = false, X = true, Y = true, Z = false, determina el valor de las siguientes expresiones lógicas:


public class EOE06 {
    
    public static void main(String[] args) {

        boolean W = true , X = false , Y = true, Z = false;
        
        System.out.print("A: ");
        System.out.println(W || Y && X && W || Z);

        System.out.print("B: ");
        System.out.println(X && !Y && !X || !W && Y);

        System.out.print("C: ");
        System.out.println(!(W || !Y) && X || Z);
        
        System.out.print("D: ");
        System.out.println(X && Y && W || Z || X);

        System.out.print("E: ");
        System.out.println(Y || !(Y || Z && W));

        System.out.print("F: ");
        System.out.println(!X && Y && (!Z || !X));





}
}
