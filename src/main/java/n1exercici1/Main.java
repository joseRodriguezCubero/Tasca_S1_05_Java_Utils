package n1exercici1;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        DirectoryList directoryList = new DirectoryList(Path.of("\\Program Files (x86)\\"));
        directoryList.DirectoryOrdering();
    }
}
