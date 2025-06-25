package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countLines {
    public static void main(String[] args) {
        int count =0;
        try(BufferedReader br = new BufferedReader(new FileReader("D://simple.txt"))){
            while (br.readLine()!=null){
                count++;
            }
            System.out.println("Count of the line is "+ count);
        }
        catch (IOException e){
            System.out.println("The error is "+ e.getMessage());
        }
    }
}
