package String2_topic;

public class swappingtheStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b;
        System.out.println("Without reversing " + a + b);
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After reversing " + a + b);

    }
}
