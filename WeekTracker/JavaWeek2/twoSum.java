package JavaWeek2;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String  [] args){
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
        int[]  number = {2,11,7,15};
        int target=9;
        int[] result= twoSum(number ,target);
        System.out.println("" + result[0]+ " "+ result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap= new HashMap<>();
        int[] os = new int[0];
        for (int i =0; i<=nums.length-1;i++){
            int complement = target-nums[i];
            if (intMap.containsKey(complement)){
                return new int[] {intMap.get(complement),i};
            }
            intMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }
}
