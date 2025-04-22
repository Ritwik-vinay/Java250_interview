package String2_topic;

public class ImmutableString {
    public static void main(String[] args) {
        String str = "Hello";
        //trying to add the new word to the string
        str.concat("world");
        System.out.println(str);
    }

}
