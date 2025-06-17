package ControlStatement;

import java.util.Scanner;

public class StringVowelAndConsonent {
    public static void main(String[] args) {
        //Enter the String
        //Identify the Character and give the ouput as Vowel and consonent
        //Input String
        //O/p VCount and Ccount

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.next();
        word= word.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        char ch = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;

                } else {
                    cCount++;
                }
            }
        }
        System.out.println(vCount);
        System.out.println(cCount);
    }
}
