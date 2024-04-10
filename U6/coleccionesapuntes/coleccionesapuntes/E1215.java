package coleccionesapuntes;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E1215 {
    
    /*
     * Implementar una aplicación para gestionar las existencias de una tienda de
     * repuestos de automóviles. Cada producto se identifica por un código
     * alfanumérico.
     * La aplicación permitirá dar de alta o de baja productos y actualizar el
     * número de unidades en stock de cada uno de ellos.
     */
    public static void main(String[] args) {

        Map<String, Integer> existencias = new TreeMap();
        int opcion;
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("=================");
            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Cambio de stock de prodcuto");
            System.out.println("4. Listar existencias");
            System.out.println("5. Salir");
            System.out.println("Opción: ");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Código del producto: ");
                    String codigo = new Scanner(System.in).next();
                    /*
                     * ANTES DE DAR DE ALTA UN PRODUCTO DEBEMOS ASEGURARNOS DE QUE NO EXISTE, YA QUE
                     * MACHACARÍA SU VALOR
                     */
                    if (!existencias.containsKey(codigo)) {
                        existencias.put(codigo, 0);
                    } else {
                        System.out.println("El producto ya existe");
                    }
                }
                case 2 -> {
                    System.out.println("Código del producto: ");
                    String codigo = new Scanner(System.in).next();
                    existencias.remove(codigo);
                    if (existencias.remove(codigo) == null) {
                        System.out.println("El producto no existe");
                    }
                }
                case 3 -> {
                    System.out.println("Código del producto: ");
                    String codigo = new Scanner(System.in).next();
                    if (existencias.containsKey(codigo)) {
                        System.out.println("Nuevo stock: ");
                        int stock = new Scanner(System.in).nextInt();
                        existencias.put(codigo, stock);
                    }
                }
                case 4 -> {
                    System.out.println(existencias);
                }
            }
        } while (opcion != 5);
    }
}
