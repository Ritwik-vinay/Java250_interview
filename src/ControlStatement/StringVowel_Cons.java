package ControlStatement;

import java.util.Scanner;

public class StringVowel_Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String word = sc.nextLine();
        word = word.toLowerCase();
        char ch;
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    vCount++;
                    System.out.println(ch + " is vowel");
                } else {
                    cCount++;
                    System.out.println(ch + " is consonent");
                }
            }
        }
        System.out.println(vCount );
        System.out.println(cCount);
    }
}
