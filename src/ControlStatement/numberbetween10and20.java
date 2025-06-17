package ControlStatement;

import java.util.Scanner;

public class numberbetween10and20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        if (num > 10 && num < 20) {
            System.out.println("Number is between 10 & 20:-  " + num);
        } else {
            System.out.println("Kindly Enter the number between the 10-20");
        }
    }
}
