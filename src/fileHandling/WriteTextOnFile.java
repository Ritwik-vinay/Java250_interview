package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextOnFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\simple.txt");
            writer.write("I am writing the File in the filewriter\n");

            writer.write("The Ritwik vinay is Billaniore\n");
            writer.write(" The Ritwik vinay\n");
            writer.write("4rth line\n");
            writer.close();
            System.out.println("New File is written");
        }
        catch (IOException e){
            System.out.println("Error Message "+ e.getMessage());
        }

    }
}
