package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextOnFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\simple.txt");
            writer.write("I am writing the File in the filewriter");
            writer.close();
            System.out.println("New File is written");
        }
        catch (IOException e){
            System.out.println("Error Message "+ e.getMessage());
        }

    }
}
