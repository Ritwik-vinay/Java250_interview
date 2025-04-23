package String2_topic;

public class Palindromewithforloop {
    public static void main(String[] args) {
        String str= "madam";
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);}
            if (rev.equalsIgnoreCase(str)){
                System.out.println("It is a Palindrome");
            }
            else {
                System.out.println("it is not a palindrome");
            }

    }
}
