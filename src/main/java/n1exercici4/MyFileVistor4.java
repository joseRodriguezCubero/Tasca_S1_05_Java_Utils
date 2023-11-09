package n1exercici4;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.FileVisitResult.TERMINATE;

public class MyFileVistor4 implements FileVisitor<Path> {
    private final String fileName;
    private final Path startDir;

    public MyFileVistor4(String fileName, Path startingDir) {
        this.fileName = fileName;
        startDir = startingDir;

    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        if (this.fileName.equals(fileName)) {
            System.out.println("File found: " + file.toString());
            FileReader.reading(file);
            return TERMINATE;
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Failed to access file: " + file.toString());
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        boolean finishedSearch = Files.isSameFile(dir, startDir);
        if (finishedSearch) {
            System.out.println("File:" + fileName + " not found");
            return TERMINATE;
        }
        return CONTINUE;
    }
}