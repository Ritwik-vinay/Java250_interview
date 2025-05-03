package String2_topic;

import java.util.Locale;

public class StrignFirstlettertoString {
    public static void main(String[] args) {
        //Getting the firstLetter of every word
        String sentence ="I am a Test Engineer";
        StringBuilder sb = new StringBuilder();
        for (String word: sentence.split("\\s+")){
            sb.append(word.charAt(0));

        }
        System.out.println(sb.toString().toUpperCase(Locale.ROOT));
    }
}
