package Strings3;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //Check if string is palindrome.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String originalstr= scn.next();
        originalstr= originalstr.toLowerCase();
        String revString ="";
        for (int i=originalstr.length()-1; i>=0;i--){
            revString = revString + originalstr.charAt(i);
        }
        if (revString.equals(originalstr)){
            System.out.println(originalstr + " -OrgString is the Palindrome revString: " + revString);
        }
        else {
            System.out.println("It is not a Palindrome");
        }

    }
}
