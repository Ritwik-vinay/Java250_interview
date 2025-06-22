package ExceptionHandling;

import java.util.InputMismatchException;
public class NumberFormatExceptionTest {
    public static void main(String[] args) {
        //Catch a NumberFormatException.
        String a = "123abc";

        try {
            int n = Integer.parseInt(a);
            System.out.println("String to Integer " + n);

        } catch (NumberFormatException e) {
            System.out.println(a + " Invalid Number Format");
        }
    }
}
