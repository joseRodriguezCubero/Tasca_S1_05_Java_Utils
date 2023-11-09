package n1exercici2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class DirAndSubDirsList {
    public static void main(String[] args) throws IOException{

    Path fileDir = Path.of("\\Program Files (x86)\\");
    MyFileVisitor2 visitor = new MyFileVisitor2();

        Files.walkFileTree(fileDir,visitor);

    }
}
