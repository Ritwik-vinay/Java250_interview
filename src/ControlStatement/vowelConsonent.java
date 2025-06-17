package ControlStatement;

import java.util.Scanner;

public class vowelConsonent {
    public static void main(String[] args) {
        //Check if a character is vowel or consonant.
        //Input character
        //O/p string
        //logic: character is entered with Scanner and then compare if the value entered is character or vovel
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        Character ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The entered character is Vowel " + ch);
            } else {
                System.out.println("Consonent");
            }

        }
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The entered character is Vowel " + ch);
            } else {
                System.out.println("Consonent");
            }


        }
    }
}
