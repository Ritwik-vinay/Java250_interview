package Strings_topic;

public class topic1_firstletters {
    public static void main(String[] args) {
        String sentence= "I live in india";
        StringBuilder sb = new StringBuilder();
        for (String word: sentence.split("\\s+")){
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString());

    }
}
