package Arrays_and_ArrayList;

public class SumOfAllElement {
    public static void main(String[] args) {
        //Find sum of all elements in an array.
        //initialize an array 1,2,3,4
        //Initialize the sum as 0
        // now using for loop put the value
        // o/p 10
        int[] arr= {1,2,3,4};
        int sum=0;
        for (int i: arr){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
