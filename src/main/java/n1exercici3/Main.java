package n1exercici3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Path fileDir = Path.of("E:\\Programacion\\programacion");
        MyFileVisitor3 visitor = new MyFileVisitor3();

        Files.walkFileTree(fileDir,visitor);
    }
}
