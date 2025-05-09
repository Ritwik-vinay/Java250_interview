package String2_topic;

public class PalindromeString_Check {

    public static void main(String[] args) {
        String s = "madam";
        s.toLowerCase();
        String rev = "";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = sb.append(s.charAt(i)).toString();
        }
        if (s.equals(rev)) {
            System.out.println("It is palindrome: " + s + " :rev: " + rev);
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
    }
}
