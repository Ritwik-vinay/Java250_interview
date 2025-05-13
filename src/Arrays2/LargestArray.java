package Arrays2;

public class LargestArray {
    public static void main(String[] args) {
        //Print the Largest Element in an Array
        int[] arr={2,22,12,0};
        int largest = arr[0];
        for (int array: arr){
            if (array>largest){
                largest=array;
            }
        }
        System.out.println(largest);
    }
}
