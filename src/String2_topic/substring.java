package String2_topic;

import java.util.HashSet;

public class substring {
    public static int subs(String s){
        HashSet<Character> set = new HashSet<>();
        int leftPointer =0;
        int maxlength=0;
        for (int rightPointer=0; rightPointer<s.length();rightPointer++){
            while (set.contains(s.charAt(rightPointer))){
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(s.charAt(rightPointer));
            maxlength= Math.max(maxlength,rightPointer-leftPointer+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s="abcdefsbc";
        int result= subs(s);
        System.out.println(result);
    }
}
