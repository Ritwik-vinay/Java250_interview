package Arrays;

import java.util.HashSet;

public class topic2_Dupe_int2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 6, 5, 5, 6, 7, 7};
        String[] names = {"Ram", "Mohan", "Roy", "Ram", "Raju", "Mohan"};
        HashSet set = new HashSet();
        HashSet setDupe = new HashSet();
        for (int nums : num) {
            if (!set.add(nums)) {
                setDupe.add(nums);
            }
        }


        for (String name : names) {
            if (!set.add(name)) {
                setDupe.add(name);
            }

        }
        System.out.println(set);
        System.out.println(setDupe);
    }

}
