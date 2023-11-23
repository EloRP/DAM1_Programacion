package pruebas;

public class pruebafactous {
    public static void main(String[] args) {
    
        System.out.println(factorial (6));
    
    }
    public static long factorial (int n) {
            long resultado; {
            if (n==0) { //si n = 0
                resultado = 1; //caso base
            } else {
                resultado = n * factorial (n-1); //llamada recursiva
            }
            return(resultado);

            }
        }
}
