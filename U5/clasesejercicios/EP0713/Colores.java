package clasesejercicios.EP0713;

public class Colores {
    static String[] colores = { "Azul", "Rojo", "Marrón", "Verde", "Rosa", "Morado" };

    public String[] elegirColores(int n) {
        if (n > colores.length) {
            System.out.println("No hay suficientes colores disponibles.");
            return null;
        }
    
        String[] coloresElegidos = new String[n];
        boolean[] indicesElegidos = new boolean[colores.length];
        int i = 0;
    
        while (i < n) {
            int randomIndex = (int) (Math.random() * colores.length);
            if (!indicesElegidos[randomIndex]) {
                coloresElegidos[i] = colores[randomIndex];
                indicesElegidos[randomIndex] = true;
                i++;
            }
        }
    
        return coloresElegidos;
    }
    public static void main(String[] args) {
        Colores paleta = new Colores();
        int numColores = 3;
        String[] coloresElegidos = paleta.elegirColores(numColores);

        System.out.println("Colores elegidos al azar:");
        for (String color : coloresElegidos) {
            System.out.println(color);
        }
    }
}
