package practicas;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cálculo del IMC. Escribe tu altura (en cm): ");
        int alturaCm = sc.nextInt();
        System.out.print("Ahora escribe tu peso en kilos: ");
        int pesoKg = sc.nextInt();
        System.out.println("Según tu peso y altura, tu IMC es de: " + imc(pesoKg, alturaCm));
        sc.close();

    }

    static double imc(double kg, double cm) {
        // Convertir altura de centímetros a metros
        double alturaMetros = cm / 100.0;
        double imc = kg / (alturaMetros * alturaMetros);
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25.0) {
            clasificacion = "Normal";
        } else if (imc >= 25.0 && imc < 30.0) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }

        System.out.println("Según tu IMC, estás clasificad@ como: " + clasificacion);
        return imc;
    }
}