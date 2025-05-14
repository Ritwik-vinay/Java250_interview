package Arrays2;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] arr= {4,3,2,1,5,6,7};
        Arrays.sort(arr);
        System.out.println("sorted arrays: ");
        for (int sortarr: arr){
            System.out.print(sortarr +" ");
        }
    }
}
