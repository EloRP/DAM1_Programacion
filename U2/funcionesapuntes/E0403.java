package funcionesapuntes;

public class E0403 {

    public static void main(String[] args) {
        areaVolumenCilindro(1, 2.5, 3.8);
        areaVolumenCilindro(2, 2.5, 3.8);
        areaVolumenCilindro(3, 2.5, 3.8);
    }

    static void areaVolumenCilindro(int opcion, double radio, double altura) {

        switch (opcion) {
            case 1 ->
                // calcular área
                System.out.println("Área = " + areaCilindro(radio, altura));
            case 2 ->
                // calcular volumen
                System.out.println("Volumen = " + volumenCilindro(radio, altura));
            default ->
                // sin numero
                System.out.println("ERROR: Presiona 1 o 2 para obtener el resultado.");
        }
    }

    static double areaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (altura + radio);
    }

    static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

}
