package n2exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Properties;

import static n1exercici3.DirListAndPrint.appendUsingBufferedWriter;

public class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("C:\\Users\\rince\\Documents\\Programacion\\Intellij\\Sprint1\\Tasca_S1_05_Java_Utils\\src\\main\\java\\n2exercici1\\config.properties")) {
            prop.load(input);
        } catch (Exception e) {
            System.out.println("No se ha cargado el fichero de configuración " + e.getMessage());
        }
        String outputPath = prop.getProperty("outputPath");

        DirectoryList2 directoryList2 = new DirectoryList2(dir);
        String appendText = directoryList2.DrirectoryOrdering();
        appendUsingBufferedWriter(outputPath, appendText, 1);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
