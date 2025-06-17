package ControlStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Find if a year is a leap year.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year " + year);
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year " + year);
        } else {
            System.out.println("Not a leap year");
        }}
}
