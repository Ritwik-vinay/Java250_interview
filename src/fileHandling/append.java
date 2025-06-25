package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class append {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("D://simple.txt")){
            writer.write("Appending new Line\n");
            writer.write("Appending another line \n");
            System.out.println("Appended Successfully");
        }
        catch (IOException e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}
