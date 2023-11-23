package clasesparaninfo;

/*
 * EP0715. Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:
*Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta. 
*void incrementarDia(): que incrementa en un día la fecha del calendario.
*void incrementarMes(): que incrementa en un mes la fecha del calendario.
*void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuenta que el año 0 no existió. 
*void mostrar(): muestra la fecha por consola.
*boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.
*Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.

 */
public class EP0715 {
    private int año;
    private int mes;
    private int dia;

    // Constructor
    public EP0715(int año, int mes, int dia) {
        if (fechaEsValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha no válida.");
        }
    }

    // Método privado para verificar si una fecha es válida
    private boolean fechaEsValida(int año, int mes, int dia) {
        if (año < 0 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int maxDias = diasPorMes[mes];

        // Verificar febrero en caso de año bisiesto (por simplicidad, no consideramos
        // años bisiestos)
        if (mes == 2 && dia == 29) {
            return false;
        }

        return dia >= 1 && dia <= maxDias;
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
    public boolean iguales(EP0715 otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        EP0715 fecha = new EP0715(2023, 11, 21);
        fecha.mostrar();

        fecha.incrementarDia();
        fecha.mostrar();

        fecha.incrementarMes();
        fecha.mostrar();

        fecha.incrementarAño(2);
        fecha.mostrar();

        EP0715 otraFecha = new EP0715(2023, 11, 21);

        System.out.println("Las fechas son iguales: " + fecha.iguales(otraFecha));
    }
}