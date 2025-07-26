package JavaWeek2;

import java.util.Scanner;

public class palinDrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name= scn.next();
        String rev="";
        for (int i=name.length()-1; i>=0;i--){
            rev = rev+ name.charAt(i);
        }
        if (rev.equalsIgnoreCase(name)){
            System.out.println(name + " is a palindrome as the rev value is " + rev);
        }
        else {
            System.out.println("OOPS!!! "+name + " is NOT a palindrome as the rev value is " + rev);
        }
    }
}
