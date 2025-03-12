package Arrays;

import java.util.HashSet;

public class topic2_Dupe_num_in_Arrays {
    public static void main(String[] args) {
        int[] number={1,1,9,2,3,4,4,5,5,6,7,8,9,0};
        HashSet<Integer> seen= new HashSet<>();
        HashSet<Integer> duplicate= new HashSet<>();
        for(int numnbers:number){
            if (!seen.add(numnbers)){
                duplicate.add(numnbers);
            }
        }
        System.out.println("Duplicate values are : " + duplicate);
        System.out.println(seen);

    }

}
