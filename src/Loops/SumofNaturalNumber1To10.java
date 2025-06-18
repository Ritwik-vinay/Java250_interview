package Loops;

public class SumofNaturalNumber1To10 {
    public static void main(String[] args) {
        //Calculate sum of first 10 natural numbers.
        int sum=0;
        for (int i=1;i<=10;i++){
            sum= i*(i+1)/2;

        }
        System.out.println(sum);
    }
}
