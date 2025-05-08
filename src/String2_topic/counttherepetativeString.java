package String2_topic;

public class counttherepetativeString {
    public static void main(String[] args) {
        String s = "abbcccddddeeeee";
        String seen = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            Character ch = s.charAt(i);
            if (seen.indexOf(ch) == -1) {
                System.out.println(ch);
                seen += ch;


            }
        }
    }


}
