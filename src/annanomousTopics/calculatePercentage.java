package annanomousTopics;

import java.util.Scanner;

public class calculatePercentage {
    //Write a program that calculates and displays the letter grade for a given numerical score
    // (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks= scn.nextInt();
        String result= marks>=90 && marks<=100? "A":(marks>=80 && marks<=89? "B":(marks>=70 && marks<=79)? "C":(marks>=60 && marks<=69)? "D": "f");
        System.out.println(result);
    }


}
