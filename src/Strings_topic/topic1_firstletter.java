package Strings_topic;

public class topic1_firstletter {
    public static void main(String[] args) {
        //First Letter of Each Word in a String
        String str="I am in country india";
        StringBuilder sb = new StringBuilder();
        for (String word: str.split("\\s")) {
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString());

    }
}
