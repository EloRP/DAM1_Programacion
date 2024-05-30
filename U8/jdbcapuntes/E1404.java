import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class E1404 {
    public static void main(String[] args) throws SQLException {
        System.out.println("Alumnado y medias del curso: ");
        System.out.println("===============================");

        mostrarInfoCurso("1B");
    }

    static void mostrarInfoCurso(String curso) throws SQLException {
         Connection conBD = conectarBD();
         Statement consulta = conBD.createStatement();

        String sql = "SELECT nombre, createdAt, notamedia " +
                     "FROM alumnos " +
                     "WHERE curso = '" + curso + "'";     
                     
        ResultSet rs = consulta.executeQuery(sql);

        while (rs.next()) {
            String nombre = rs.getString(1);
            LocalDateTime createdAt = Instant.ofEpochMilli(rs.getDate(2).getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
            Double notaMedia = rs.getDouble(3);

            System.out.println(nombre + " (" + createdAt + ") " + ((int) (notaMedia * 100)) / 100.0);
        }

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
