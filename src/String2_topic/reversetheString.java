package String2_topic;

public class reversetheString {
    public static void main(String[] args) {
        String s= "Selenium is the good course";
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev= rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
