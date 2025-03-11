package Arrays;

import java.util.HashSet;

public class topic2_arrays {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6};
        int[] b= {5,6,7,8,9,10};
        HashSet set = new HashSet();
        for (int sum:a){
            set.add(sum);
        }
        for(int sum:b){
            set.add(sum);
        }
        System.out.println(set);

    }

}
