package Arrays;

import java.util.HashSet;

public class topic2_Dupe3 {
    public static void main(String[] args) {
        int[] num={12,11,14,12,11,10};
        HashSet set = new HashSet();
        HashSet dupeSet = new HashSet();
        for (int nums: num){
            if (!set.add(nums)){
                dupeSet.add(nums);

            }

        }
        System.out.println(dupeSet);
        System.out.println(set);
    }
}
