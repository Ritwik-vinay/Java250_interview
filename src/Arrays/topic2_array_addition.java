package Arrays;

public class topic2_array_addition {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={5,6,7,8,8,9};
        // Create a new array to store the sum
        int[] result = new int[a.length];

        // Add corresponding elements
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }

        // Print the results
        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}
