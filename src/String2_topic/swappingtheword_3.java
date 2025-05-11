package String2_topic;

public class swappingtheword_3 {
    public static void main(String[] args) {
        String a="Ritwik";
        String b= "vinay";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("Switching the words "+ a+" "+b);
    }
}
