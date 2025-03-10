package Strings_topic;

import java.util.HashSet;

public class topic1_substring {
    public static void main(String[] args) {
        //revise it again
        //Longest Substring Without Repeating Characters
        String s = "kajhsdhd";
        int maxlength = findlongestsubstring(s);
        System.out.println(maxlength);
    }


    private static int findlongestsubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int leftPointer =0;
        int maxlength=0;
        for (int rightpointer=0; rightpointer<s.length();rightpointer++){
            while (hs.contains(s.charAt(rightpointer))){
                hs.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            hs.add(s.charAt(rightpointer));
            maxlength= Math.max(maxlength,rightpointer-leftPointer+1);
        }
        return maxlength;

    }
}