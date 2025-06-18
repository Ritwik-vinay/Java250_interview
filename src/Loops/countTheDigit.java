package Loops;

public class countTheDigit {
    public static void main(String[] args) {
        int n= 654567788;
        int count = 0;
        for (; n!=0;n/=10){
            count++;
        }
        System.out.println(count);

    }
}
