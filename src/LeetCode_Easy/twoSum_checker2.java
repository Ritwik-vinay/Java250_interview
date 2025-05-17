package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class twoSum_checker2 {
    public static void main(String[] args) {
        test_two_Sum_checker sums = new test_two_Sum_checker();
        int[] result = sums.sum_check(new int[]{2, 1, 5, 1, 7, 8, 9}, 11);
        System.out.println("Indices " + result[0] + " , " + result[1]);


    }

    public static class test_two_Sum_checker {
        public int[] sum_check(int[] number, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i <= number.length; i++) {
                int complementry = target - number[i];
                if (map.containsKey(complementry)) {
                    return new int[]{map.get(complementry), i};

                }
                map.put(number[i], i);

            }
            throw new IllegalArgumentException("No two sum found");


        }

    }
}
