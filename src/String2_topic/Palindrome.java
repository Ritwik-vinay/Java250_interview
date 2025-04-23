package String2_topic;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder();

        String rev = sb.append(str).reverse().toString();
        if (rev.equalsIgnoreCase(str)){
            System.out.println(rev + " is a Palindrome");
        }
        else {
            System.out.println(rev+ " is not a Palindrome!!");
        }
    }
}
