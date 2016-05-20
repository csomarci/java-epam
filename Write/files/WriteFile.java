package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(args[0]);

            pw.println("Line1");
            pw.println("Line2");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) pw.close();
        }
    }
}