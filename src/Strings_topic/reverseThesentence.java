package Strings_topic;

public class reverseThesentence {
    public static void main(String[] args) {
        String str= "This is a bug";
        String rev = "";
        for (int i= str.length()-1;i>=0;i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println(rev);

    }
}
