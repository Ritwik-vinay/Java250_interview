package ExceptionHandling;

import java.util.Scanner;

public class tryCatchFInallyProgram {
    public static void main(String[] args) {
        //Use finally block with try-catch
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the PIN CODE 4 digit: ");
        int n = scn.nextInt();
        int totalAmount = 22000;
        System.out.println("Enter the Amount: ");
        int deductedAmount = scn.nextInt();
        ;
        try {
            if (deductedAmount < totalAmount) {
                System.out.println("Total Amount after deduction " + (totalAmount - deductedAmount));
            }
            else {
                System.out.println("Enter the Amount less than the TOTAL AMOUNT");
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (deductedAmount <= totalAmount){
                System.out.println(totalAmount-deductedAmount +" Transaction Successful");
            }else {
                System.out.println("Transaction Failed");
            }

        }
    }
}
