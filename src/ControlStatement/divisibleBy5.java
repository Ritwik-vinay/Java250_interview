package ControlStatement;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        //4.	Use if to check if a number is divisible by 5.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scn.nextInt();
        if (num%5==0){
            System.out.println("Number is divisible by 5 "+num);
        }
        else {
            System.out.println("Opps!!! the number is not divisible by 5");
        }
    }
}
