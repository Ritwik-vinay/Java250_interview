package Arrays2;

public class printsmallest {
    public static void main(String[] args) {
        int[] arr={2,3,4,12,34,54,1,23,43,54};
        int smallest = arr[0];
        for (int array: arr){
            if (array<smallest){
                smallest=array;
            }
        }
        System.out.println(smallest);
    }
}
