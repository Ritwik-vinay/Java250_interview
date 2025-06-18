package Loops;

public class FactorialOfNumber {
    public static void main(String[] args) {
        //Find factorial of a number
        int num=5;
        int fact =1;
        for (int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
