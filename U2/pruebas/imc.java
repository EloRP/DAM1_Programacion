package pruebas;

import javax.swing.JOptionPane;

public class imc {
    /**
     * Programa de ejemplo de uso de cuadros de diálogo con la clase JOptionPane del
     * paquete javax.
     */
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese su nombre
        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?");

        // Verificar si el usuario ingresó un nombre
        if (nombre != null && !nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "!");
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste un nombre válido.");
        }
    }
}