package JavaWeek2;

import java.util.Locale;
import java.util.Scanner;

public class revTheString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name= scn.nextLine();
        String rev="";
        for (int i=name.length()-1; i>=0;i--){
            rev = rev+ name.charAt(i);
        }
        System.out.println(rev.toUpperCase());
        scn.close();
    }
}
