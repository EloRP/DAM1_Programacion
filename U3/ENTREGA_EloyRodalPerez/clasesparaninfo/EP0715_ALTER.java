package clasesparaninfo;

/*Amplía el programa para tener en cuenta también los años bisiestos.*/

public class EP0715_ALTER {
    private int año;
    private int mes;
    private int dia;

    // Constructor
    public EP0715_ALTER(int año, int mes, int dia) {
        if (fechaEsValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha no válida.");
        }
    }

    // Método privado para verificar si una fecha es válida, teniendo en cuenta años
    // bisiestos
    private boolean fechaEsValida(int año, int mes, int dia) {
        if (año < 0 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Ajustar febrero para años bisiestos
        if (esBisiesto(año)) {
            diasPorMes[2] = 29;
        }

        int maxDias = diasPorMes[mes];

        return dia >= 1 && dia <= maxDias;
    }

    // Método privado para verificar si un año es bisiesto
    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Método para incrementar en un día la fecha del calendario
    public void incrementarDia() {
        dia++;
        if (!fechaEsValida(año, mes, dia)) {
            dia = 1;
            incrementarMes();
        }
    }

    // Método para incrementar en un mes la fecha del calendario
    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    // Método para incrementar la fecha del calendario en el número de años
    // especificados
    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    // Método para mostrar la fecha por consola
    public void mostrar() {
        System.out.println("Fecha: " + año + "/" + mes + "/" + dia);
    }

    // Método para determinar si dos fechas son iguales
    public boolean iguales(EP0715_ALTER otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        EP0715_ALTER fecha = new EP0715_ALTER(2023, 2, 28);
        fecha.mostrar();

        fecha.incrementarDia();
        fecha.mostrar();

        fecha.incrementarMes();
        fecha.mostrar();

        fecha.incrementarAño(1);
        fecha.mostrar();

        EP0715_ALTER otraFecha = new EP0715_ALTER(2024, 2, 28);

        System.out.println("Las fechas son iguales: " + fecha.iguales(otraFecha));
    }
}