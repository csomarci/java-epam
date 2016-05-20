package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("s", "z");
                line = line.replaceAll("ck", "x");
                line = line.replaceAll("a", "@");
                line = line.replaceAll("e", "3");
                line = line.replaceAll("i", "1");
                line = line.replaceAll("o", "0");
                line = line.replaceAll("u", "v");
                line = line.replaceAll("f", "ph");
                line = line.replaceAll("g", "9");
                line = line.replaceAll("y", "j");
                line = line.replaceAll("t", "+");
                line = line.replaceAll("!", "1");
				
				
				System.out.println(line);
            }
			br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}