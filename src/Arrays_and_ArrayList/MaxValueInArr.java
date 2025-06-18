package Arrays_and_ArrayList;

public class MaxValueInArr {
    public static void main(String[] args) {
        //Find the maximum value in an array.
        int[] arr ={4,5,3,6,7,8,1,2,3};
        int maxValue=arr[0];
        for (int i: arr){
            int currentValue =arr[i];
            if (maxValue<currentValue){
                maxValue= currentValue;
            }

        }
        System.out.println(maxValue);

    }
}
