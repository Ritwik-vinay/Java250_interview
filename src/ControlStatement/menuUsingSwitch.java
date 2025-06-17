package ControlStatement;

import java.util.Scanner;

public class menuUsingSwitch {
    public static void main(String[] args) {
        //Write a simple menu using switch.
        //Input perform a user action of addition and substraction
        //Give the output as integer or String(if not matches the condition)
        Scanner scn = new Scanner(System.in);
        int choice;
        do {

            System.out.println("----Menu-----");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Exit the Program");
            System.out.println("Enter you Choice");
            choice = scn.nextInt();


            int a, b;
            switch (choice) {
                case 1:
                    System.out.println("Enter two number to add");
                    a = scn.nextInt();
                    b = scn.nextInt();
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter two number to substract");
                    a = scn.nextInt();
                    b = scn.nextInt();
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Exiting Goodbye.....");
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
            System.out.println();
        }while (choice!=3);

        scn.close();


    }
}
