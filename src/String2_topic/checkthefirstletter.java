package String2_topic;

import java.util.Locale;

public class checkthefirstletter {
    public static void main(String[] args) {
        String sentence= "This is my computer";
        StringBuilder sb = new StringBuilder();
        for (String word: sentence.split("\\s+")){
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString().toUpperCase(Locale.ROOT));
    }
}
