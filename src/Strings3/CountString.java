package Strings3;

public class CountString {
    public static void main(String[] args) {
        //Count characters in a string.
        String s1= "Billaniore Ritwik123";
        int count=0;
        for (int i=0;i<s1.length();i++){
            if (Character.isLetter(s1.charAt(i))){
                count++;
            }

        }
        System.out.println(count);
    }
}
