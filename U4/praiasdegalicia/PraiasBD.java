package praiasdegalicia;

import java.sql.Connection;
import java.sql.ResultSet;

public class PraiasBD {
    public static void main(String[] args) {
        
        Praia[] praias;

        praias = leerPraiasBD();

        for(int i = 0; i < praias.length; i++){
            System.out.println(praias[i].getNome());
        }
    }

    private static Praia[] leerPraiasBD(){
        Praia[] p = null;

        try (Connection connection = Conexion.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM praia");
            ResultSet resultSet = preparedStatement.executeQuery()) {
            
            while (resultSet.next())
            }
    }
}


