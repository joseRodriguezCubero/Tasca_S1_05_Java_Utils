package n1exercici1;


import java.io.File;
import java.nio.file.Path;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.comparator.SizeFileComparator;

public class DirectoryList {



    private final Path dir;

    public DirectoryList(Path dir) {
        this.dir = dir;
    }

    public void DrirectoryOrdering() {
        //NameFileComparator
        File parentDir;
        parentDir = FileUtils.getFile(new String[]{dir.toString()});
        NameFileComparator comparator = new NameFileComparator(IOCase.SENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());

        System.out.println("directory: "+dir);
        for (File file : sortedFiles) {

            if(file.isDirectory()) {
                System.out.println("\t(D)" + file.getName());
            }else{
                System.out.println("\t(F)" + file.getName());
            }
        }
    }
}