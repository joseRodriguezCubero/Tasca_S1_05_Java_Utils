package n3exercici1;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptingApi {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        SecretKey secretKey = AESUtils.generateKey(256);

        FileEncrypterDecrypter fileEncrypterDecrypter = new FileEncrypterDecrypter(secretKey,"AES/CBC/PKCS5Padding");

        fileEncrypterDecrypter.encrypt("AES/CBC/PKCS5Padding","E:\\Programacion\\directories.txt");

        fileEncrypterDecrypter.decrypt("E:\\Programacion\\directories.txt");



    }



}
