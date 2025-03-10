package Strings_topic;

public class topic1_removeLeadZero {
    public static void main(String[] args) {
        String str= "000123900";
       str =str.replace("0","");
        System.out.println("String without leading zeros: '" + str + "'");



    }
}
