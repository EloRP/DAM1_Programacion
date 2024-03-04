import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    String texto;
    final int LONGITUDTEXTO;
    LocalDate fechaCreacion;
    LocalDateTime fechaModificacion;

    public Texto(int LONGITUDTEXTO) {
        this.LONGITUDTEXTO = LONGITUDTEXTO;
        texto = "";
        fechaCreacion = LocalDate.now();
        fechaModificacion = LocalDateTime.now();
    }

    public boolean anhadirInicio(char caracter) {
        if (texto.length() < LONGITUDTEXTO) {
            texto = caracter + texto;
            fechaModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public boolean anhadirFinal(char caracter) {
        if (texto.length() < LONGITUDTEXTO) {
            texto = texto + caracter;
            fechaModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public boolean anhadirInicio(String string) {
        if (texto.length() + string.length() <= LONGITUDTEXTO) {
            texto = string + texto;
            fechaModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public boolean anhadirFinal(String string) {
        if (texto.length() + string.length() <= LONGITUDTEXTO) {
            texto = texto + string;
            fechaModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public int contarVocales() {
        String vocales = "aeiouáéíóúüÁÉÍÓÚÜ";
        int contarVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contarVocales++;
            }
        }
        return contarVocales;
    }

    public void mostrar() {
        System.out.println("TEXTO " + texto);
        System.out.println("Longitud máxima: " + LONGITUDTEXTO);
        System.out.println("Creado en " + fechaCreacion);
        System.out.println("Modificado en " + fechaModificacion);
        System.out.println("Número de vocales: " + contarVocales());
    }

    public static void main(String[] args) {
        Texto texto = new Texto(100);
        texto.anhadirFinal("Diseña la clase Texto que gestiona una cadena de caracteres con algunas características");
        texto.anhadirInicio("0706.");
        texto.anhadirInicio("E");
        texto.anhadirFinal(":");
        texto.mostrar();
    }
}