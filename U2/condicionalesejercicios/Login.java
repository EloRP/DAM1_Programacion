package condicionalesejercicios;

/* Login. Realiza un programa que solicite por teclado un nombre de usuario y contraseña,
y que compruebe si corresponden al usuario “admin” con contraseña “abc123.,”
indicando como resultado un mensaje apropiado.
 */
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String usuario, contraseña;
        final String USUARIO = "admin";
        final String CONTRASENA = "abc123";

        do {
            System.out.println("Introduce tu usuario: ");
            usuario = sc.next();

            System.out.println("Introduce tu contraseña: ");
            contraseña = sc.next();

            if (!usuario.equals(USUARIO) || !contraseña.equals(CONTRASENA)) {
                System.out.println("Inicio de sesión fallido. Revisa el usuario o contraseña.");
            }

        } while (!usuario.equals(USUARIO) || !contraseña.equals(CONTRASENA));

        sc.close();
        System.out.println("Inicio de sesión correcto. Bienvenid@.");
    }
}
