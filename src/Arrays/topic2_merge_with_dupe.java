package Arrays;

import java.util.Arrays;

public class topic2_merge_with_dupe {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6};
        int[] arr2={4,5,6,7,8,9};
        int[] mergedArray = new int[arr1.length + arr2.length];

        for(int i=0;i<=arr1.length-1;i++){
            mergedArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i]= arr2[i];
        }
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
