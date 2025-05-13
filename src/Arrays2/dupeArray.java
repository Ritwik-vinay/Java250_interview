package Arrays2;

import java.util.HashMap;
import java.util.HashSet;

public class dupeArray {
    public static void main(String[] args) {
        //Duplicate Array
        int[] arr={1,2,3,4,12,4,12,1};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dupe = new HashSet<>();
        for (int num: arr){
            if (!seen.add(num)){
                dupe.add(num);
            }
        }
        System.out.println(dupe);
    }
}
