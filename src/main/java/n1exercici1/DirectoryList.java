package n1exercici1;


import java.io.File;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import java.nio.file.attribute.FileTime;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DirectoryList {



    private final Path dir;

    public DirectoryList(Path dir) {
        this.dir = dir;
    }

    public void DirectoryOrdering() {
        //NameFileComparator
        File parentDir;

        parentDir = FileUtils.getFile(new String[]{dir.toString()});
        NameFileComparator comparator = new NameFileComparator(IOCase.SENSITIVE);
        File[] sortedFiles = comparator.sort(parentDir.listFiles());

        System.out.println("directory: "+dir);
        for (File file : sortedFiles) {
            //Date fecha = new Date(file.lastModified());
            //fecha.toLocalDate();

            long ms = file.lastModified();
            Date d = new Date(ms);
            Calendar c = new GregorianCalendar();
            c.setTime(d);

            String dia= Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString(c.get(Calendar.MONTH));
            String annio = Integer.toString(c.get(Calendar.YEAR));
            String hour= Integer.toString(c.get(Calendar.HOUR_OF_DAY));
            String minuto = Integer.toString(c.get(Calendar.MINUTE));
            String segundo = Integer.toString(c.get(Calendar.SECOND));

            String fecha = dia+"/"+mes+"/"+annio+" "+hour+":"+minuto+":"+segundo


            ; if(file.isDirectory()) {
                System.out.println("\t(D)" + file.getName() +" "+file.lastModified()+" "+fecha);
            }else{
                System.out.println("\t(F)" + file.getName()+" "+file.lastModified()+" "+fecha);
            }
        }
    }
}