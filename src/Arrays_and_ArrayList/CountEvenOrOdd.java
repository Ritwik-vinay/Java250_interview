package Arrays_and_ArrayList;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        //Count even and odd numbers in an array.
        int[] arr = {1, 2, 4, 3};
        int evenCount = 0;
        int OddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i + " Even Number");
                evenCount++;
            } else if (i % 2 != 0) {
                System.out.println(i + " odd Number");
                OddCount++;

            } else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Total Even: " + evenCount);
        System.out.println("Total Odd: " + OddCount);


    }
}
