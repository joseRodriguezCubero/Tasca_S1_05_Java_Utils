package n1exercici4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FindAndRead {

    public static void main(String[] args) throws IOException {
        String name = Entrada.leerString("introduzca nombre de archivo")+".txt";

        Path fileDir = Path.of("E:\\");
        MyFileVisitor4 visitor = new MyFileVisitor4();
        visitor.setName(name);
        Files.walkFileTree(fileDir,visitor);

    }
}

