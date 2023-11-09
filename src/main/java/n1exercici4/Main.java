package n1exercici4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) throws IOException {
        String name = Entrada.leerString("introduzca nombre de archivo de su escritorio")+".txt";

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        Path desktop = Path.of(desktopPath);

        MyFileVistor4 visitor = new MyFileVistor4(name, desktop);
        Files.walkFileTree(desktop, visitor);

    }
}

