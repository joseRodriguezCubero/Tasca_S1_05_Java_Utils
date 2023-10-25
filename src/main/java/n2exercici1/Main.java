package n2exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("C:\\Users\\rince\\Documents\\Programacion\\Intellij\\Sprint1\\Tasca_S1_05_Java_Utils\\src\\main\\java\\n2exercici1\\config.properties")) {
            prop.load(input);
        } catch (Exception e) {
            System.out.println("No se ha cargado el fichero de configuración " + e.getMessage());
            return;
        }

        String directory= prop.getProperty("directory");

        Path fileDir = Path.of(directory);
        MyFileVisitor3 visitor = new MyFileVisitor3();

        Files.walkFileTree(fileDir,visitor);
    }
}

