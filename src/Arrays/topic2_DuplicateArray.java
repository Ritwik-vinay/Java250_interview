package Arrays;

import java.util.HashSet;

public class topic2_DuplicateArray {
    //Elements of an Array in Reverse Order
    public static void main(String[] args) {
        int[] i={1,2,3,4,4,5,0,5,6,7,8,9,8,10};
        HashSet<Integer> set = new HashSet<>();
        for(int number:i){
            set.add(number);
        }
        System.out.println(set);

    }

}
