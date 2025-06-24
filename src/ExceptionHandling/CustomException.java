package ExceptionHandling;

import java.util.Scanner;

public class CustomException  {
    public static void main(String[] args) throws InvaidAgeException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scn.nextInt();
        try {
            if (age<18){
                throw new InvaidAgeException("You are not eligible to vote");
            }
            System.out.println("You are eligible to vote");
        }
        catch (InvaidAgeException e){
            System.out.println(e.getMessage());
        }

    }
    public static class InvaidAgeException extends Exception{
        public InvaidAgeException(String ageException){
            super(ageException);

        }
    }
}
