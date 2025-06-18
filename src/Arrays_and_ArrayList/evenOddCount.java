package Arrays_and_ArrayList;

public class evenOddCount {
    public static void main(String[] args) {
        int[] arr= {1,4,6,5,7};
        int OddCount=0;
        int evenCount =0;
        for (int i: arr){
            if (i%2==0){
                System.out.println(i + " Even Number");
                evenCount++;
            }
            else{
                System.out.println(i + " Odd Counts");
                OddCount++;
            }
        }
        System.out.println("Even Count = "+ evenCount);
        System.out.println("Odd Count = "+ OddCount);
    }
}
