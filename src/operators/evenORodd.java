package operators;

import java.util.Scanner;

public class evenORodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " Number is even");
        } else {
            System.out.println(n + " number is odd");
        }
    }
}
