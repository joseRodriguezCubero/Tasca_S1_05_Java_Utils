package n1exercici3;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import java.io.File;
import java.nio.file.Path;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        NameFileComparator comparator = new NameFileComparator(IOCase.INSENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());


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

            String fecha = "---Last modified: "+day+"/"+month+"/"+year+" "+hour+":"+minute+":"+seconds;

            if(file.isDirectory()) {
                result.append("\n(D)").append(file.getName()).append(fecha);
            }else{
                result.append("\n(F)").append(file.getName()).append(fecha);
            }
        }
        return "\n----> directory: "+dir.getFileName() + result;
    }
}