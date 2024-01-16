package arraysparaninfo;

public class EP5017 {
    public static void main(String[] args) {
        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;

        int[] resultado = suma(t, numElementos);

        // Mostrar el resultado
        System.out.print("[");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] suma(int[] t, int numElementos) {
        // Verificar si el tamaño de t es menor que numElementos
        if (t.length < numElementos) {
            throw new IllegalArgumentException("El tamaño de t debe ser igual o mayor que numElementos.");
        }

        // Calcular el tamaño del resultado
        int tamanoResultado = t.length - numElementos + 1;

        // Crear la tabla de resultados
        int[] resultado = new int[tamanoResultado];

        // Calcular las sumas consecutivas
        for (int i = 0; i < tamanoResultado; i++) {
            int suma = 0;
            for (int j = 0; j < numElementos; j++) {
                suma += t[i + j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }
}
