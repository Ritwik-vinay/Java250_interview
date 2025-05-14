package Arrays2;

import java.util.Arrays;

public class secondSmallestnum {
    public static void main(String[] args) {
        int[] arr={34,23,23,45,34,54,768,768,78,12,14};
        Arrays.sort(arr);
        System.out.println("Second Smallest Numeber: " + arr[1]);
    }
}
