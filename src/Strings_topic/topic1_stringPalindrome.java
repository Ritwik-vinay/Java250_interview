package Strings_topic;

public class topic1_stringPalindrome {
    public static void main(String[] args) {
        String orgname = "madam";
        String rev = "";
        for (int i = orgname.length() - 1; i >= 0; i--) {
            rev = rev + orgname.charAt(i);
        }
        if (rev.equalsIgnoreCase(orgname)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is Not a Palindrome");

        }


    }
}
