package Arrays2;

import java.util.HashMap;
import java.util.HashSet;

public class dupe2 {
    public static void main(String[] args) {
        int[] arr2={1,1,1,2,2,3,4,12,3,4,5,12};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dupe = new HashSet<>();
        for (int num: arr2){
            if (!seen.add(num)){
                dupe.add(num);
            }
        }
        System.out.println(dupe);
    }
}
