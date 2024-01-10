package arraysapuntes;

public class E0501 {
    public static void main(String[] args) {
        //Declaración y creación del array
        double numeros[] = new double[10];
    
        //Inicialización con nums aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * 100;
            System.out.println(numeros[i]);
        }

        //Cálculo de la suma
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
    
        //Salida
        System.out.println("Suma total = " + suma);
    
    
    
    }
}
