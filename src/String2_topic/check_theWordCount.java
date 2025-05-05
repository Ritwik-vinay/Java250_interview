package String2_topic;

public class check_theWordCount {
    public static void main(String[] args) {
        String scn= "Word should be counted as per the string mentioned";
        String[] word= scn.split("\\s+");
        System.out.println(word.length);
    }
}
