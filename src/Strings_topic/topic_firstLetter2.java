package Strings_topic;

public class topic_firstLetter2 {
    public static void main(String[] args) {
        String myString="SHUT UP NOISE!!";
        StringBuilder sb = new StringBuilder();
        for (String word: myString.split("\\s")){
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString());
    }
}
