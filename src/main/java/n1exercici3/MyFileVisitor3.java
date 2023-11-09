package n1exercici3;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import static n1exercici3.DirListAndPrint.appendUsingBufferedWriter;

public class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        DirectoryList2 directoryList2 = new DirectoryList2(dir);
        String appendText = directoryList2.DrirectoryOrdering();
        String desktopPath = System.getProperty("user.home") + "/Desktop/directories.txt";
        appendUsingBufferedWriter(desktopPath, appendText, 1);
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
