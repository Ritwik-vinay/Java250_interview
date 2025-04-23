package String2_topic;

public class firstletter {
    public static void main(String[] args) {
        String words= "I am an Indian I am Proud of it ";
        StringBuilder firstLetter = new StringBuilder();
        for (String letter: words.split("\\s+")){
            firstLetter.append(letter.charAt(0));
        }
        System.out.println(firstLetter.toString());
    }
}
