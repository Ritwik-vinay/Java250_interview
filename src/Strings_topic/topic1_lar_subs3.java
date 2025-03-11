package Strings_topic;

import java.util.HashSet;

public class topic1_lar_subs3 {
    public static void main(String[] args) {
        String s= "12111";
        int max= largeSubs(s);
        System.out.println(max);
    }
    public static int largeSubs(String s){
        HashSet<Character> st = new HashSet<>();
        int leftPointer =0;
        int maxLength=0;
        for (int rigthPointer = 0; rigthPointer <s.length() ; rigthPointer++) {
            while (st.contains(s.charAt(rigthPointer))){
                st.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            st.add(s.charAt(rigthPointer));
            maxLength= Math.max(maxLength,rigthPointer-leftPointer+1);
        }
        return maxLength;
    }
}
