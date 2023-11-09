package n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public static void reading(Path file) throws IOException {

        try (Stream<String> stream = Files.lines(file)) {
            stream.forEach(System.out::println);
        }
    }
}


