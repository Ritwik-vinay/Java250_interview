package ControlStatement;

import java.util.Scanner;

public class Pass_fail_nestedIfElse {
    public static void main(String[] args) {
        //Nest if-else to check pass/fail with grade.
        //Grade A= 90-100 B= 80-90 C= 60-80 D= Fail
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade");
        int grade = sc.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("A grade");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B Grade");
        } else if (grade>= 50 && grade<= 79) {
            System.out.println("C Grade");
        }
        else {
            System.out.println("Hurray!!! you are eligible to learn");
        }
    }
}
