package ExceptionHandling;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        //Use try-catch to handle division by zero.
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter the num A: ");
        int a = scn.nextInt();
        System.out.print("Enter number B: ");
        int b = scn.nextInt();
        try {
            int result= a/b;
        } catch (ArithmeticException e) {
            System.out.println("Divided by Zero not allowed!!!!");
        }

    }
}
