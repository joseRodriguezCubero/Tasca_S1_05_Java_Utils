package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirListAndPrint {


        public static void appendUsingBufferedWriter(String filePath, String text, int noOfLines) {
            File file = new File(filePath);
            FileWriter fr = null;
            BufferedWriter br = null;
            try {
                // to append to file, you need to initialize FileWriter using below constructor
                fr = new FileWriter(file, true);
                br = new BufferedWriter(fr);
                for (int i = 0; i < noOfLines; i++) {
                    br.newLine();
                    // you can use write or append method
                    br.write(text);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}