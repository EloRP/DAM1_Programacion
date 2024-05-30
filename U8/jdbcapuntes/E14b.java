import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class E14b {

    /*
     * @author Eloy Rodal Pérez
     * E14b. Crea un método que actualice la base con la nota de un alumno y una
     * evaluación concreta que se pasan como parámetros de entrada.
     * 
     * Utiliza el método para insertar notas aleatorias entre 0 y 10 en todas las
     * evaluaciones de todos los alumnos
     */

    public static void main(String[] args) throws SQLException {

        List<String> lista = new ArrayList<>();
        lista.add("Alberto");
        lista.add("Angel");
        lista.add("Alejandro");
        lista.add("Borja");
        lista.add("Xabier");
        lista.add("Marcos");
        lista.add("Óscar");
        lista.add("Carla");
        lista.add("Alfonso");
        lista.add("Jorge");
        lista.add("Jonathan");
        lista.add("Pedro");
        lista.add("Yeray");
        lista.add("Alex");
        lista.add("Diego P");
        lista.add("Rodrigo");
        lista.add("Miguel");
        lista.add("Eloy");
        lista.add("Gonzalo");
        lista.add("Victoria");
        lista.add("David");
        lista.add("Yoel");
        lista.add("Diego");

        for (String nombre : lista) {
            double nota1 = Math.round(Math.random() * 10 * 100.0) / 100.0;
            double nota2 = Math.round(Math.random() * 10 * 100.0) / 100.0;
            double nota3 = Math.round(Math.random() * 10 * 100.0) / 100.0;

            asignarNotas(nota1, 1, nombre);
            asignarNotas(nota2, 2, nombre);
            asignarNotas(nota3, 3, nombre);
        }
    }

    public static void asignarNotas(double notaAlumno, int evaluacion, String nombreAlumno) throws SQLException {
        Connection conBD = conectarBD();
        if (conBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            Statement consulta = conBD.createStatement();
            String sql;
            switch (evaluacion) {
                case 1:
                    sql = "UPDATE ALUMNOS SET nota1 =" + notaAlumno + " WHERE nombre = '" + nombreAlumno + "'";
                    consulta.executeUpdate(sql);
                    break;
                case 2:
                    sql = "UPDATE ALUMNOS SET nota2 =" + notaAlumno + " WHERE nombre = '" + nombreAlumno + "'";
                    consulta.executeUpdate(sql);
                    break;
                case 3:
                    sql = "UPDATE ALUMNOS SET nota3 =" + notaAlumno + " WHERE nombre = '" + nombreAlumno + "'";
                    consulta.executeUpdate(sql);
                    break;
                default:
                    System.out.println("No se permite ese número de evaluación.");
                    break;
            }

        }

    }

    static private Connection conectarBD() {
        Connection con;
        String url = "jdbc:mysql://" + BD.HOST + "/" + BD.DATABASE;
        try {
            return DriverManager.getConnection(url, BD.USER, BD.PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
