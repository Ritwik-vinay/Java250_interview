package String2_topic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkemailFormatter2 {
    public static void main(String[] args) {
        String email="abc@test.com";
        String emailregex= "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pat= Pattern.compile(emailregex);
        Matcher mat = pat.matcher(email);
        if (mat.matches()){
            System.out.println("Valid Email Format");
        }
        else
            System.out.println("Invalid Email Format");
    }


}
