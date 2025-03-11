package Strings_topic;

import java.util.HashSet;

public class topic1_LargestSubstring1 {
    public static void main(String[] args) {
        String s="acbjhsapo";
        int max= largeSubString(s);
        System.out.println(max);
    }
    public static int largeSubString(String s){
        HashSet<Character> set = new HashSet<>();
        int leftallign =0;
        int maxlength=0;
        for (int rightpointer=0;rightpointer<s.length();rightpointer++){
            while (set.contains(s.charAt(rightpointer))){
                set.remove(s.charAt(leftallign));
                leftallign++;

            }
            set.add(s.charAt(rightpointer));
            maxlength =Math.max(maxlength,rightpointer-leftallign+1);
        }
        return maxlength;

    }}
