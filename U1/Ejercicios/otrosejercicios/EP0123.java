package otrosejercicios;

public class EP0123 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int a = 5, b = 7;
            
        System.out.println("Antes: a = " + a + ", b = " + b);
    
        // Proceso
        int temp; // variable temporal auxiliar
            
        temp = a;
        a = b;
        b = temp;
            
        // Salida
        System.out.println("Después: a = " + a + ", b = " + b);
    }
    
}
