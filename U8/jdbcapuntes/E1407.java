import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class E1407 {

    /*
     * @author Eloy Rodal Pérez
     * E1407. Crea un programa/método que solicite el nombre de un alumno y lo
     * elimine.
     * Utiliza este programa para practicar la técnica de SQL Injection
     * introduciendo como nombre de alumno una cadena que haga que se borren todos
     * los registros de la tabla.
     * 
     */
    public static void main(String[] args) throws SQLException {

        Connection conexionBD = conectarBD();
        
        if (conexionBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del alumno a borrar: ");
            String nombre = sc.nextLine();
            borrarAlumno(conexionBD, nombre);
            conexionBD.close();
        }
    }

    static void borrarAlumno(Connection con, String nombre) throws SQLException {
        Statement consulta = con.createStatement();
        String sql = "DELETE FROM Alumno "
                + " WHERE nombre = '" + nombre + "'";
        consulta.executeUpdate(sql);

    }

    static private Connection conectarBD() {
        String url = "jdbc:mysql://" + BD.HOST + "/" + BD.DATABASE;
        try {
            return DriverManager.getConnection(url, BD.USER, BD.PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
