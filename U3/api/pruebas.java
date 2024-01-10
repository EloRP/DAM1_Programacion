package api;

public class pruebas {

    public static void main(String[] args) {

}
    class Persona {
        static String hoy = "lunes";

        static void hoyEs(int dia) {
            hoy = switch (dia) {
                case 1 -> "lunes";
                case 2 -> "martes";
                case 3 -> "miercoles";
                default -> "error";
            };
        }
    }
}
