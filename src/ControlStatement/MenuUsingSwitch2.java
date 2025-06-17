package ControlStatement;

import java.util.Scanner;

public class MenuUsingSwitch2 {
    public static void main(String[] args) {
        //Creating another menu using the Swith
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--Menu--");
            System.out.println("1.Multiplication");
            System.out.println("2. Division");
            System.out.println("3. Exit the Process");
            System.out.println("Enter your choice");
            choice= sc.nextInt();
            int a,b;
            switch (choice){
                case 1:
                    System.out.println("Multiplication");
                    a=sc.nextInt();
                    b= sc.nextInt();
                    System.out.println("Result: "+ (a*b));
                    break;
                case 2:
                    System.out.println("Division");
                    a= sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("Result: "+ (a/b));
                    break;
                case 3:
                    System.out.println("Exiting Bye!!!...");
                    break;
                default:
                    System.out.println("Enter the valid value");
            }
            System.out.println();
        }
        while (choice!=3);
        sc.close();
    }
}
