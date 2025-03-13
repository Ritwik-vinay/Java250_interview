package Arrays;

public class topic2_Array_largest {
    public static void main(String[] args) {
        //Print the Largest Element in an Array
        // Lets assume that if the arr2[0] is largest
        int[] arr_num= {21,24,11,10,77,78,11,14};
        int max= arr_num[0];
        for (int nums: arr_num){
            if (nums>max){
                max=nums;
            }
        }
        System.out.println(max);
    }
}
