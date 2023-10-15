package n1exercici4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public static void reading(String fileName){

        try {
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                stream.forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}


