package Strings_topic;

import java.util.HashSet;

public class topic1_largestString2 {
    public static void main(String[] args) {
        String s="123145";
        int max=largestSubStringmethod(s);
        System.out.println(max);
    }
    public static int largestSubStringmethod(String str){
        HashSet<Character> sets = new HashSet<>();
        int leftpointer=0;
        int maxlength=0;
        for (int rigthPointer = 0; rigthPointer <str.length() ; rigthPointer++) {
            while (sets.contains(str.charAt(rigthPointer))){
                sets.remove(str.charAt(leftpointer));
                leftpointer++;
            }
            sets.add(str.charAt(rigthPointer));
            maxlength= Math.max(maxlength,rigthPointer-leftpointer+1);
        }
        return maxlength;
    }
}
