package Strings_topic;

import java.awt.*;
import java.util.Scanner;

public class topic1_reverseStr {
    public static void main(String[] args) {
        //Reverse the String
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Name! ");
        String str =scn.next();

        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse the string!! "+ rev);
    }
    }
