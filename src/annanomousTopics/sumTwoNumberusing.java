package annanomousTopics;

public class sumTwoNumberusing {
    public int sumNums(int a ,int b){
        int sum = a+b;
        return sum;
    }
    public int sumNums(int a , int b, int c){
        int sum= a+b+c;
        return sum;

    }

    public static void main(String[] args) {
    sumTwoNumberusing stn= new sumTwoNumberusing();
    int res = stn.sumNums(15,16);
    System.out.println(res);
    int res2= stn.sumNums(10,20,30);
        System.out.println(res2);

    }

}
