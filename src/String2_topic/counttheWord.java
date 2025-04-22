package String2_topic;

public class counttheWord {
    public static void main(String[] args) {
        String sentence= "Hello my practice of the Java codes are on the way";
        String[] words= sentence.split("\\s+");
        System.out.println("Number of words in sentence are "+ words.length );
    }
}
