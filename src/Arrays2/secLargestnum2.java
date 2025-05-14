package Arrays2;

import java.util.Arrays;

public class secLargestnum2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,21,34,54,65,3,23,43};
        Arrays.sort(arr);
        System.out.println("Second largest number: "+ arr[arr.length-2]);
    }
}
