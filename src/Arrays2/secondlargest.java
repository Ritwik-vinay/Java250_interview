package Arrays2;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,23,43,65,67};
        Arrays.sort(arr);

        System.out.println("Second largest number: " + arr[arr.length-2]);

    }
}
