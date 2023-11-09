package n3exercici1;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

//Este ejercicio ha sido realizado con la ayuda de la siguiente web. https://www.baeldung.com/java-aes-encryption-decryption

public class EncryptingApi {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        SecretKey secretKey = AESUtils.generateKey(256);

        FileEncrypterDecrypter fileEncrypterDecrypter = new FileEncrypterDecrypter(secretKey, "AES/CBC/PKCS5Padding");

        String contenidoOriginal = leerContenido("src/main/java/n2exercici1/directories.txt");

        fileEncrypterDecrypter.encrypt(contenidoOriginal, "src/main/java/n2exercici1/directories_cifrado.txt");

        String contenidoDesencriptado = fileEncrypterDecrypter.decrypt("src/main/java/n2exercici1/directories_cifrado.txt");
        System.out.println("Contenido desencriptado:\n" + contenidoDesencriptado);
    }

    private static String leerContenido(String rutaArchivo) throws IOException {
        // Lee el contenido del archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append(System.lineSeparator());
            }
            return sb.toString();
        }
    }
}
