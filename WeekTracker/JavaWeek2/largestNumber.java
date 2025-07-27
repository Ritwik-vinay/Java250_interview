package JavaWeek2;

public class largestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 25, 8, 15, 3};

        int max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
