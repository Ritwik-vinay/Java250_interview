package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        twoSumsCheck obj = new twoSumsCheck();
        int[] result= obj.twosums(new int[]{1,2,3,4,5,6,7,8},9);
        System.out.println("Indices "+ result[0]+" , "+  result[1]);

    }

    public static class twoSumsCheck {
        public int[] twosums(int[] num, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i <= num.length; i++) {
                int complement = target - num[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(num[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
}
