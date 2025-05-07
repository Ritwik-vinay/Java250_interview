package String2_topic;

import java.util.HashSet;

public class subs2 {
    public static int subs2_cal(String s){
        HashSet<Character> set = new HashSet<>();
        int leftpointer=0;
        int maxlength=0;
        for (int rightpointer=0; rightpointer<s.length();rightpointer++){
            while (set.contains(s.charAt(rightpointer))){
                set.remove(s.charAt(leftpointer));
                leftpointer++;
            }
            set.add(s.charAt(rightpointer));
            maxlength= Math.max(maxlength,rightpointer-leftpointer+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s= "abcdefcd";
        int result= subs2_cal(s);
        System.out.println(result);
    }
}
