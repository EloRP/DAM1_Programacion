package praiasdegalicia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class PraiasBD {

    public static void main(String[] args) {

        Praias[] praias;

        praias = leerPraiasBD();

        for (int i = 0; i < praias.length; i++) {
            System.out.println(praias[i].getNome() + " - " + praias[i].getUrlPrediccionMeteogalicia());
        }

    }

    private static Praias[] leerPraiasBD() {
        Praias[] praias = new Praias[0];

        try (Connection connection = Conexion.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM praia");
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Praias praia = new Praias();
                praia.setId(resultSet.getInt("id"));
                praia.setNome(resultSet.getString("nome"));
                praia.setConcello(resultSet.getString("concello"));
                praia.setProvincia(resultSet.getString("provincia"));
                praia.setLat(resultSet.getDouble("lat"));
                praia.setLon(resultSet.getDouble("lon"));

                praias = Arrays.copyOf(praias, praias.length + 1);
                praias[praias.length - 1] = praia;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return praias;

    }

}