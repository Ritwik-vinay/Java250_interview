package String2_topic;

public class palindrome_String {
    public static void main(String[] args) {
        String str = "madams";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("It is a Palinderome " + rev + " = " + str);
        }
        else {
            System.out.println("!!!It is not a Palinderome " + rev + " = " + str);
        }


    }
}
