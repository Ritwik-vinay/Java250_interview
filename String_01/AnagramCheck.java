import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        anagramString("listen", "silent");
    }


    static void anagramString(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        if (Arrays.equals(s1, s2)) {
            System.out.println("The String is Anagram");
        } else {
            System.out.println("The string is not Anagram");
        }

    }
}
