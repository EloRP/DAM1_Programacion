package examenud05CORREGELOY;

import java.time.LocalDateTime;

public class AppLixoDeLuxoObjetoDetalles {

        static Objeto[] objetos = {
                        new Objeto("Laptop", "Laptop en buen estado", "Calle Principal",
                                        new User("aguado"), LocalDateTime.of(2024, 2, 20, 10, 0), new User("igarcrodr"),
                                        LocalDateTime.of(2024, 2, 20, 13, 0), true),
                        new Objeto("Teléfono", "Teléfono en buen estado", "Parque Central",
                                        null, LocalDateTime.of(2024, 2, 10, 20, 0), null, null, false),
                        new Objeto("Camisa", "Camisa de algodón", "Avenida Central",
                                        new User("aguado"), LocalDateTime.of(2024, 3, 3, 12, 0), null, null, false),
                        new Objeto("Pantalones", "Pantalones vaqueros", "Plaza Mayor",
                                        null, LocalDateTime.of(2024, 2, 21, 10, 0), null,
                                        LocalDateTime.of(2024, 2, 21, 12, 0), true),
                        new Objeto("Silla", "Silla de madera", "Biblioteca Pública",
                                        null, LocalDateTime.of(2024, 2, 28, 10, 0), null, null, false),
                        new Objeto("Mesa centro", "Mesa de centro", "Parque",
                                        null, LocalDateTime.of(2024, 1, 31, 10, 0), null, null, false),
                        new Objeto("Harry Potter", "Libro de fantasía", "Casa Abandonada",
                                        null, LocalDateTime.of(2024, 2, 20, 10, 0), new User("aguado"),
                                        LocalDateTime.of(2024, 2, 20, 12, 0), true),
                        new Objeto("Libro viejo", "Libro de fantasía épica", "Callejón Oscuro",
                                        new User("aguado"), LocalDateTime.of(2024, 3, 5, 10, 0), null, null, false)
        };

        public static void main(String[] args) {
                System.out.println("\nLIXO DE LUXO");
                System.out.println("==============\n");

                for (Objeto o : objetos)
                        o.mostrarDetalles();

                System.out.println();

        }
}
