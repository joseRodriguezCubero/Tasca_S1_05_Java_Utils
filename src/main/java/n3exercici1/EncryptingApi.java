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
//El ejercicio lo tengo en un estado previo más simplificado pero no podía desencriptar correctamente. Solucionado por la IA CHat GPT.

public class EncryptingApi {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        SecretKey secretKey = AESUtils.generateKey(256);

        FileEncrypterDecrypter fileEncrypterDecrypter = new FileEncrypterDecrypter(secretKey, "AES/CBC/PKCS5Padding");

        // Leer todo el contenido del archivo
        String contenidoOriginal = leerContenido("E:\\Programacion\\directories.txt");

        // Cifrar y escribir el contenido cifrado en un nuevo archivo
        fileEncrypterDecrypter.encrypt(contenidoOriginal, "E:\\Programacion\\directories_cifrado.txt");

        // Desencriptar el archivo cifrado (solo para verificar)
        String contenidoDesencriptado = fileEncrypterDecrypter.decrypt("E:\\Programacion\\directories_cifrado.txt");
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