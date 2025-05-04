package String2_topic;

import java.util.Locale;

public class firstLetter_Check {
    public static void main(String[] args) {
        String value="where is my earphone";
        StringBuilder sb = new StringBuilder();
        for (String words: value.split("\\s+")){
            sb.append(words.charAt(0));

        }
        System.out.println(sb.toString().toUpperCase(Locale.ROOT));
    }
}
