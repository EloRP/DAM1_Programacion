package ejerciciosmath;

    import java.util.Scanner;

    public class InteresCompuesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de dinero inicial (principal): ");
        double principal = sc.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (%): ");
        double tasaInteresAnual = sc.nextDouble();

        System.out.print("Ingresa el número de veces que se compone el interés por año: ");
        int vecesCompuestoAnual = sc.nextInt();

        System.out.print("Ingresa el número de años: ");
        int tiempoEnAnios = sc.nextInt();

        double montoFinal = formulaInteresCompuesto(principal, tasaInteresAnual, vecesCompuestoAnual, tiempoEnAnios);

        System.out.println("La cantidad final con interés compuesto es: " + montoFinal);

        sc.close();
    }
        public static double formulaInteresCompuesto(double principal, double tasaInteresAnual, int vecesCompuestoAnual, int tiempoEnAnios) {
        double tasaInteresDecimal = tasaInteresAnual / 100;
        return principal * Math.pow(1 + tasaInteresDecimal / vecesCompuestoAnual, vecesCompuestoAnual * tiempoEnAnios);
    }
}
