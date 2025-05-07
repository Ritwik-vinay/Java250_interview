package String2_topic;

import java.util.HashSet;

public class subsStringCalculation {
    public static int substringCals(String s){
        HashSet<Character> set = new HashSet();
        int leftPointer=0;
        int maxlenght=0;
        for (int rightPointer= 0;rightPointer<s.length();rightPointer++){
            while (set.contains(s.charAt(rightPointer))){
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(s.charAt(rightPointer));
            maxlenght= Math.max(maxlenght,rightPointer-leftPointer+1);
        }
        return maxlenght;
    }

    public static void main(String[] args) {
        String s= "abcdefabc";
        int result= substringCals(s);
        System.out.println(result);
    }
}
