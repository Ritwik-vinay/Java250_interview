package JavaWeek2;
import java.util.HashMap;
import java.util.Map;

public class longest_subs {
    public static void main(String [] args){
        String input= "abcdabcbbdd";
        System.out.println(subsString(input));
    }
    public static int subsString(String str){
        Map<Character, Integer> chMap = new HashMap<>();
        int ml=0;
        int lp=0;
        for (int rp=0;rp<str.length();rp++){
            if (chMap.containsKey(str.charAt(rp))&& chMap.get(str.charAt(rp))>=lp){
                lp= chMap.get(str.charAt(rp))+1;
            }
            chMap.put(str.charAt(rp),rp);
            ml= Math.max(ml, rp-lp+1);
        }
        return ml;
    }
}
