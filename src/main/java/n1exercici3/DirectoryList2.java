package n1exercici3;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import java.io.File;
import java.nio.file.Path;

public class DirectoryList2 {
    private final Path dir;

    public DirectoryList2(Path dir) {
        this.dir = dir;
    }

    public String DrirectoryOrdering() {
        //NameFileComparator
        File parentDir;
        StringBuilder result = new StringBuilder();
        parentDir = FileUtils.getFile(new String[]{dir.toString()});
        NameFileComparator comparator = new NameFileComparator(IOCase.SENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());


        for (File file : sortedFiles) {

            if(file.isDirectory()) {
                result.append("\n(D)").append(file.getName());
            }else{
                result.append("\n(F)").append(file.getName());
            }
        }
        return "\n----> directory: "+dir.getFileName() + result;
    }
}