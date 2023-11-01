package ejsProp;

public class EP0120 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        double numero, raiz;
        // En este ejercicio usamos la clase Scanner sin importarla previamente.
        java.util.Scanner entrada;
        entrada = new java.util.Scanner(System.in);
            
        // Entrada de datos
        System.out.print("Introduce un número real: ");
        numero = entrada.nextDouble();
            
        // Proceso
        raiz = Math.sqrt(numero);
            
        // Salida
        System.out.println("Raíz cuadrada: " + raiz);
    }
    
    
    
}
