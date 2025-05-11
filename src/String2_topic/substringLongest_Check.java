package String2_topic;

import java.util.HashSet;

public class substringLongest_Check {
    public static void main(String[] args) {
        String s= "abcabcbd";
        int result= substringCheck(s);
        System.out.println(result);

    }
    public static int substringCheck(String s){
        HashSet<Character> set= new HashSet<>();
        int leftpoint=0;
        int maxlength=0;
        for (int rightpoint=0; rightpoint<s.length();rightpoint++){

            while (set.contains(s.charAt(rightpoint))){
                set.remove(s.charAt(leftpoint));
                leftpoint++;
            }
            set.add(s.charAt(rightpoint));
            maxlength= Math.max(maxlength, rightpoint-leftpoint+1);
        }
        return maxlength;

    }
}
