package ControlStatement;

import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        //2.	Find the largest of three numbers using if-else
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number A");
        int a= scn.nextInt();
        System.out.println("Enter the Number B");
        int b =scn.nextInt();
        System.out.println("Enter the Number c");
        int c = scn.nextInt();
        if (a>=b&& a>=c){
            System.out.println(a +" is the largest of All");
        }
        else if (b>a && b>c){
            System.out.println(b +" is the largest of All");
        }
        else
        {
            System.out.println(c +" is the largest of all");
        }
    }
}
