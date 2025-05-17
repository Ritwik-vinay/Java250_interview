package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class twosumcheck3 {
    public static void main(String[] args) {
        sumchecker3 sums= new sumchecker3();
        int[] result= sums.twosum(new int[]{3,10,12,15,28,4},38);
        System.out.println("Indices "+ result[0]+ " "+result[1]);

    }
    public static class sumchecker3{
        public int[] twosum(int[] num, int target){
            Map<Integer,Integer> map= new HashMap<>();
            for (int i =0;i<=num.length;i++){
                int complement = target- num[i];
                if (map.containsKey(complement)){
                    return  new int[] {map.get(complement),i};
                }
                map.put(num[i],i);
            }
            throw new IllegalArgumentException("No sum Present");

        }
    }
}
