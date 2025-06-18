package Strings3;

public class Substring {
    public static void main(String[] args) {
        //Extract substring from index 2 to 5.
        String s1= "Billaniore Ritwik vinay";
        for (int i=0; i<= s1.length();i++){
            if (Character.isLetter(s1.charAt(i))){
                System.out.println(s1.substring(2,12));
                break;
            }
            else {
                System.out.println("It is not a character");

            }        }
    }
}
