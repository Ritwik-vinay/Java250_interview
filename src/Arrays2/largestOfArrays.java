package Arrays2;

public class largestOfArrays {

    public static void main(String[] args) {
        int[] arr={2,3,4,55,12,23,11,21,44};
        int largest= arr[0];
        for (int array: arr){
            if (array>largest ){
                largest= array;
            }
        }
        System.out.println(largest );
    }
}
