package operators;

import java.util.Scanner;

public class ternaryOperation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scn.nextInt();
        System.out.println("Enter Number 2");
        int b= scn.nextInt();
        int max= (a>b)? a:b;
        System.out.println(max +" is the greatest number");
    }
}
