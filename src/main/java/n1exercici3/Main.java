package n1exercici3;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        Path fileDir = Path.of(desktopPath);
        MyFileVisitor3 visitor = new MyFileVisitor3();

        Files.walkFileTree(fileDir,visitor);
    }
}

