package Strings_topic;

public class topic1_firstletter1 {
    public static void main(String[] args) {
        String myName="Talk to you later";
        StringBuilder sb = new StringBuilder();
        for (String word: myName.split("\\s")){
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString());

    }
}
