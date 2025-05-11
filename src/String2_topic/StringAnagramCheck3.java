package String2_topic;

import java.util.Arrays;

public class StringAnagramCheck3 {
    public static Boolean checkAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {
        String s1 = "listen3";
        String s2 = "Silent3";
        System.out.println(checkAnagram(s1, s2) ? "Anagram" : "Not Anagram");
    }
}
