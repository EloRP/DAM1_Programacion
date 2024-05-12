package ficherosejercicios;

public class EP1018 {

    /*
     * @author Eloy Rodal Pérez
     * EP1018. Escribe la función Integer[] leerEnteros(String texto), a la que se
     * le pasa una cadena y devuelve una tabla con todos los enteros que aparecen en
     * ella.
     */

    public static void main(String[] args) {

        String texto = "Hola 1 2 3 prueba 5 7 prueba";

        Integer[] enteros = leerEnteros(texto);

        for (Integer entero : enteros) {
            System.out.println(entero);
        }
    }

    public static Integer[] leerEnteros(String texto) {
        String[] palabras = texto.split(" ");
        int contador = 0;
        for (String palabra : palabras) {
            try {
                Integer.parseInt(palabra);
                contador++;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        
        Integer[] enteros = new Integer[contador];
        contador = 0;
        for (String palabra : palabras) {
            try {
                enteros[contador] = Integer.parseInt(palabra);
                contador++;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return enteros;
    }
}
