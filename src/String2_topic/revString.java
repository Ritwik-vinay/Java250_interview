package String2_topic;

public class revString {
    public static void main(String[] args) {
        String name = "Ritwik";
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        String rev= sb.reverse().toString();
        System.out.println(rev);

    }
}
