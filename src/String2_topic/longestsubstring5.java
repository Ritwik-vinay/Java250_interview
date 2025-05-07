package String2_topic;

import java.util.HashSet;

public class longestsubstring5 {
    public static int longsubs(String s){
        HashSet<Character> set = new HashSet<>();
        int lp=0;
        int ml=0;
        for (int rightp=0;rightp<s.length();rightp++){
            while (set.contains(s.charAt(rightp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(s.charAt(rightp));
            ml= Math.max(ml,rightp-lp+1);

        }
        return ml;

    }

    public static void main(String[] args) {
        String s= "abcddde";
        int result= longsubs(s);
        System.out.println(result);
    }
}
