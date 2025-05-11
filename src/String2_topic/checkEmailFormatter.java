package String2_topic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkEmailFormatter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the email");
        String email= scn.next();
        String emailRegex= "^[a-zA-Z0-9.%+-]+@[a-zA-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pat= Pattern.compile(emailRegex);
        Matcher mat= pat.matcher(email);
        if (mat.matches()){
            System.out.println("Valid Email ID");
        }
        else {
            System.out.println("Invalid Email ID");
        }
    }
}
