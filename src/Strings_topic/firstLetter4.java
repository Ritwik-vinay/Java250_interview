package Strings_topic;

public class firstLetter4 {
    public static void main(String[] args) {
        String sentence = "I will be back";
        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split("\\s+")) {
            sb.append(word.charAt(0));

        }
        System.out.println(sb.toString());

    }
}
