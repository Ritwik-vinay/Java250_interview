package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static void main(String[] args)  {
        //Read contents of a file line by line.
        try (BufferedReader br = new BufferedReader(new FileReader("D://simple.txt"))){
            String line ;
            int lineNumber =1;
            while ((line = br.readLine()) != null){
                System.out.print("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
