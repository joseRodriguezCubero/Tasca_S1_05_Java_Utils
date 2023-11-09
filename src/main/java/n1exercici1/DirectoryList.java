package n1exercici1;

import java.io.File;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DirectoryList {

    private final Path dir;

    public DirectoryList(Path dir) {
        this.dir = dir;
    }

    public void DirectoryOrdering() {
        //NameFileComparator
        File parentDir;

        parentDir = FileUtils.getFile(new String[]{dir.toString()});
        NameFileComparator comparator = new NameFileComparator(IOCase.INSENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());

        System.out.println("directory: "+dir);
        for (File file : sortedFiles) {

            long ms = file.lastModified();
            Date d = new Date(ms);
            Calendar c = new GregorianCalendar();
            c.setTime(d);

            String day= Integer.toString(c.get(Calendar.DATE));
            String month = Integer.toString(c.get(Calendar.MONTH));
            String year = Integer.toString(c.get(Calendar.YEAR));
            String hour= Integer.toString(c.get(Calendar.HOUR_OF_DAY));
            String minute = Integer.toString(c.get(Calendar.MINUTE));
            String seconds = Integer.toString(c.get(Calendar.SECOND));

            String fecha = day+"/"+month+"/"+year+" "+hour+":"+minute+":"+seconds


            ; if(file.isDirectory()) {
                System.out.println("\t(D)" + file.getName() +" "+fecha);
            }else{
                System.out.println("\t(F)" + file.getName()+" "+fecha);
            }
        }
    }
}