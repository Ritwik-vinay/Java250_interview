package ControlStatement;

import java.util.Scanner;

public class leapYearAnotherApproach {
    public static void main(String[] args) {
        //Leap Year Logic: if year%4==0 && year%100!=0 || year%400==0
        //Then only leap year
        //Else not a leap Year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400 ==0)){
            System.out.println("Year is Leap year "+year);
        }
        else {
            System.out.println(year +" is not a Leap Year");
        }
    }
}
