package ExceptionHandling;

import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Enter the namem");
            String name= scn.next();
            System.out.println("Enter the age ");
            String age = String.valueOf(scn.nextInt());
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
