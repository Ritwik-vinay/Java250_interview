package Arrays_and_ArrayList;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,0,-1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

      //  int[] sorted= Arrays.stream(arr).sorted().toArray();
        //System.out.println(Arrays.toString(sorted));
     }
}
