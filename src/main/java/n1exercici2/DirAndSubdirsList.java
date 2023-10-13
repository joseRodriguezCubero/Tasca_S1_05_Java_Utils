package n1exercici2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirAndSubdirsList {
    public static void main(String[] args) throws IOException{

    Path fileDir = Path.of("E:\\Programacion");
    MyFileVisitor2 visitor = new MyFileVisitor2();

        Files.walkFileTree(fileDir,visitor);

    }
}
