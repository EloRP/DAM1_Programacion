package loginlog;

import java.nio.charset.StandardCharsets;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class CifradoBcrypt {

    /**
     * Valida un hash de BCrypt versión 2Y con una contraseña en texto plano en formato String
     * @param password Contraseña en texto plano
     * @param hash2y Hash de BCrypt versión 2Y
     * @return true si la contraseña coincide con el hash, false en caso contrario
     */
    public static boolean validarHash2Y(String password, String hash2y) {
        return BCrypt.verifyer(BCrypt.Version.VERSION_2Y)
                .verifyStrict(password.getBytes(StandardCharsets.UTF_8),
                        hash2y.getBytes(StandardCharsets.UTF_8)).verified;
    }

    /**
     * Genera un hash de BCrypt versión 2Y a partir de una contraseña en texto plano en formato String
     * @param password Contraseña en texto plano
     * @return Hash de BCrypt versión 2Y
     */
    public static String generarHash2Y(String password) {
        char[] bcryptChars = BCrypt.with(BCrypt.Version.VERSION_2Y).hashToChar(13, password.toCharArray());
        return String.valueOf(bcryptChars);
    }  


    /* Versiones de los métodos anteriores usando una contraseña en formato byte[] */
    public static boolean validarHash2YByte(String password, byte[] hash2y) {
        return BCrypt.verifyer(BCrypt.Version.VERSION_2Y)
                .verifyStrict(password.getBytes(StandardCharsets.UTF_8), hash2y).verified;
    }

    public static byte[] generarHash2YByte(String password) {
        return BCrypt.with(BCrypt.Version.VERSION_2Y).hash(13, password.getBytes(StandardCharsets.UTF_8));
    }
  

}
