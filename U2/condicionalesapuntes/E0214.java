package condicionalesapuntes;


import java.util.Scanner;

public class E0214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;
        int anho;
        int mes;

        System.out.println("Introduce un mes del año (1 - 12): ");
        mes = sc.nextInt();
        if (mes > 12 || mes <= 0) {
            System.out.println("Mes inválido. Revisa el número que has escrito.");
            sc.close();
            return;
        }

        System.out.println("Introduce un día de cualquier mes del año (1 - 31): ");
        dia = sc.nextInt();
        if ((dia > 28) && (mes == 2)) {
            System.out.println("Combinación de día y mes inválida.");
            sc.close();
            return;
        }
        if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Combinación de día y mes inválida.");
            sc.close();
            return;
        }
        if ((dia > 31) && (mes == 1 || mes == 5 || mes == 10 || mes == 12 || mes == 3 || mes == 7 || mes == 8)) {
            System.out.println("Combinación de día y mes inválida.");
            sc.close();
            return;
        }
        System.out.println("Introduce un año cualquiera: ");
        anho = sc.nextInt();

        sc.close();

        switch (dia++) {

            case 4:
            case 6:
            case 9:
            case 11:
                if (dia++ > 30)
                    mes++;
                break;

            case 1:
            case 5:
            case 10:
            case 3:
            case 7:
            case 8:
                if (dia++ > 31)
                    dia = 1;
                    mes++;
                break;

            case 2:
                if (dia > 28)
                    dia = 1;
                    mes++;
                break;

        }

        switch (mes) {

            case 12:
                if (++dia > 31)
                    dia = 1;
                    mes = 1;
                    anho++;
        }

        System.out.print("La fecha al día siguiente sería: ");
        System.out.print(dia);
        System.out.print("-");
        System.out.print(mes);
        System.out.print("-");
        System.out.print(anho);
    }
}
