package ControlStatement;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //Start with the Approach
        //1.	Check if a number is positive or negative.
        //Enter the integer
        //O/p integer
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        if (num>0){
            System.out.println(num+" It is a Positive Number");
        } else if (num==0) {
            System.out.println(num +" It is a Zero neither Positive nor Negative");
        }
        else {
            System.out.println(num +" It is Negative Number");
        }

    }
}
