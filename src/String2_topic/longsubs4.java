package String2_topic;

import java.util.HashSet;

public class longsubs4 {
    public static int longsubs(String s){
        HashSet<Character> set = new HashSet<>();
        int lp=0;
        int ml= 0;
        for (int rp=0;rp<s.length();rp++){
            while (set.contains(s.charAt(rp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(s.charAt(rp));
            ml= Math.max(ml,rp-lp+1);
        }
        return ml;
    }

    public static void main(String[] args) {
        String s= "abcdabc";
        int result= longsubs(s);
        System.out.println(result);
    }
}
