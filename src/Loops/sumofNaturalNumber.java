package Loops;

public class sumofNaturalNumber {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum= i*(i+1)/2;
        }
        System.out.println(sum);
    }
}
