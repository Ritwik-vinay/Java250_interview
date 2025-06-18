package Loops;

public class PrimeNumber1To20 {
    public static void main(String[] args) {
        //Print even numbers from 1 to 20.
        for (int n = 1; n <= 20; n++) {
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.print(n +" ");
            }
        }
    }
}
