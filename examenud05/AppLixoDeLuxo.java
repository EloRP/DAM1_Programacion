package examenud05;

import java.util.Scanner;

public class AppLixoDeLuxo extends User {

    public AppLixoDeLuxo(String username, String password) {
        super(username, password);
    }

    public static void main(String[] args) {
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("LIXO DE LUXO");
        System.out.println("=========\n");
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println(
                "\n1. Iniciar sesión de usuario" +
                        "\n2. Publicar objeto encontrado" +
                        "\n3. Listar objetos publicados anónimamente" +
                        "\n4. Recoger objeto" +
                        "\n0. SALIR" +
                        "\nSeleccione una opción");
        int comando = sc.nextInt();
        sc.nextLine();
        while (comando != 0) {
            switch (comando) {
                case 1:
                    username = sc.nextLine();
                    password = sc.nextLine();
                    loginUsuario(username, password);
                    if (loginUsuario(username, password) != null) {
                        System.out.println("=== MENÚ DE USUARIO " + (username) + "===");
                        System.out.println("\n1. Publicar objeto encontrado" +
                                "\n2. Listar objetos publicados" +
                                "\n3. Recoger objeto" +
                                "\n0. SALIR" +
                                "\nSeleccione una opción:");
                        int comandoLogin = sc.nextInt();
                        sc.nextLine();
                        while (comandoLogin != 0) {
                            switch (comandoLogin) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Número no válido.");
                                    break;
                            }
                        }
                        System.out.println("Gracias por usar Lixo de Luxo.");
                        break;
                    }
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Número no válido.");
                    break;
            }
        }
        sc.close();
    }
}
