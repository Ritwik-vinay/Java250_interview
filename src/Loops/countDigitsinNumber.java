package Loops;

public class countDigitsinNumber {
    public static void main(String[] args) {
        //Count digits in a number.
        int num = 5436;
        int count= 0;
        for (; num!=0; num/=10 ){
            count++;

        }
        System.out.println(count);
    }
}
