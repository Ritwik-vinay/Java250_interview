package Strings_topic;

import java.util.Scanner;

public class Reverse_the_word {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the word");
        String word= scn.nextLine();
        String rev="";
        for (int i=word.length()-1;i>=0;i--){
            rev= rev+word.charAt(i);
        }
        System.out.println(rev);

    }

}
