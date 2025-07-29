package JavaWeek2;

import java.util.HashMap;
import java.util.Map;

public class longSubstring {
    public static void main(String [] args){
        String input = "abcabcbb";
        System.out.println(longest_SubsString(input));
    }
    public static int longest_SubsString(String str){
        Map<Character, Integer> charMap = new HashMap<>();
        int maxlength=0;
        int leftpointer=0;
        for (int rightPointer=0; rightPointer<str.length();rightPointer++){
            if (charMap.containsKey(str.charAt(rightPointer)) && charMap.get(str.charAt(rightPointer))>=leftpointer){
                leftpointer= charMap.get(str.charAt(rightPointer)) + 1;
            }
            charMap.put(str.charAt(rightPointer),rightPointer);
            maxlength = Math.max(maxlength, rightPointer-leftpointer+1);
        }
        return maxlength;
    }
}
