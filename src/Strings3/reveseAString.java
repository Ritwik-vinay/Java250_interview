package Strings3;

public class reveseAString {
    public static void main(String[] args) {
        //Reverse a string.
        String str= "madama";
        String rev= " ";
        for (int i=str.length()-1; i>=0;i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println(rev);

    }
}
