package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class twoSumchecker4 {
    public static void main(String[] args) {
        sumTwoNum sn= new sumTwoNum();
        int[] result= sn.sumsTwo(new int[]{50,60,50,10,20},100);
        System.out.println("Indices "+result[0]+" + " +result[1] +" = 100");
    }
    public static class sumTwoNum{
        public int[] sumsTwo(int[] number, int target){
            Map<Integer,Integer> map= new HashMap<>();
            for (int i=0; i<= number.length;i++){
                int complement= target- number[i];
                if (map.containsKey(complement)){
                    return new int[]{map.get(complement),i};
                }
                map.put(number[i],i);
            }
            throw new IllegalArgumentException("Sums not found");
        }
    }
}
