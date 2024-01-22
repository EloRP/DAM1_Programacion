package Matriculas;

public class Matriculas {

    public static void main(String[] args) {

        System.out.println(esMatriculaValida("12A4BBB"));
    }

    public static boolean esMatriculaValida(String matricula) {
        boolean matriculaValida = false;
        String abecedario = "BCDFGHJKLMNPQRSTVWXYZ";

        if (!(matricula == null || matricula.length() != 7 || matricula == "")) {
            for (int i = 0; i < 3; i++) { // Validar números de la matrícula
                if (Character.isDigit(matricula.charAt(i))) {
                    matriculaValida = true;
                } else {
                    matriculaValida = false;
                    i = 3;
                }
            }
            if (matriculaValida == true) {
                for (int i = 4; i < matricula.length(); i++) { // Validar letras de la matrícula
                    for (int j = 0; j < abecedario.length(); j++) {
                        if (matricula.charAt(i) == abecedario.charAt(j)) {
                            matriculaValida = true;
                            break;
                        } else {
                            matriculaValida = false;
                        }
                    }
                    if (matriculaValida == false) {
                        i = matricula.length();
                    }
                }
            }
        }

        return matriculaValida;

    }

    public static String siguienteMatricula(String matricula) {
        String siguienteMatricula = "";
        esMatriculaValida(matricula);
        incrementarDigitos(matricula);
        return siguienteMatricula;
    }

    public static String incrementarDigitos(String matricula) {
        String siguienteMatricula = "";
        if (matricula.substring(0, 3).equals("9999")) {
            siguienteMatricula += "0000";
        } else if (matricula.substring(1, 3).equals("999")) {
            siguienteMatricula += (matricula.charAt(0)) + 1;
            siguienteMatricula += "000";
        } else if (matricula.substring(2, 3).equals("99")) {
            siguienteMatricula += matricula.charAt(0);
            siguienteMatricula += matricula.charAt(1) + 1;
            siguienteMatricula += "00";
        } else if (matricula.substring(3, 3).equals("9")) {
            siguienteMatricula += matricula.charAt(0);
            siguienteMatricula += matricula.charAt(1);
            siguienteMatricula += matricula.charAt(2) + 1;
            siguienteMatricula += "0";
        }else {
            siguienteMatricula += (matricula.substring(0, 3)) + 1;
        }
        for (int i = 4; i < matricula.length(); i++) {
            siguienteMatricula += matricula.charAt(i);
        }
        return siguienteMatricula;
    }
}
