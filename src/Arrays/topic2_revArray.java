package Arrays;

import java.util.Arrays;

public class topic2_revArray {
    public static void main(String[] args) {
        //Elements of an Array in Reverse Order
        int[] arr1={11,12,13,14,15};
        System.out.println("Reverse Array");
        for (int i=arr1.length-1; i>=0;i--){
            System.out.println(arr1[i]+" ");
        }

    }
}
