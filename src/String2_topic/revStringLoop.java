package String2_topic;

public class revStringLoop {
    public static void main(String[] args) {
        String org ="My name is Ritwik";
        String rev ="";
        for (int i=org.length()-1;i>=0;i--){
            rev= rev+ org.charAt(i);

        }
        System.out.println(rev);
    }
}
