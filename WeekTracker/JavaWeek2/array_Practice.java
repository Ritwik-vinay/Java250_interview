package JavaWeek2;

import java.util.Arrays;

public class array_Practice {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        int[] b = new int[5];
        b[0]=5;
        b[1]=2;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(a[3]);
        String[] fruits= {"Grapes", "Apple", "Papaya"};
        System.out.println(Arrays.toString(fruits));
    }
}
