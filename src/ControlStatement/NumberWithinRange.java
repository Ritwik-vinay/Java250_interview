package ControlStatement;

import java.util.Scanner;

public class NumberWithinRange {
    public static void main(String[] args) {
        //Check if a number is within a range.
        //Check the Upperrange of voting and Lower range of voting
        //Input integer
        //Output String
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scn.nextInt();
        if (age>=1 && age<=100 ){
            if (age< 18){
                System.out.println("Under Age");
            }
            else if (age>=18 && age<= 80){
                System.out.println("Eligible to Vote");
            }
            else
            {
                System.out.println("You are GOD");
            }
        }
        else {
            System.out.println("Enter an Appropriate number");
        }

    }
}
