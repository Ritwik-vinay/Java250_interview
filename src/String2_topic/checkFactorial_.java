package String2_topic;

public class checkFactorial_ {
    static int factorial_new(int n){
        if(n==0||n==1)
            return 1;
        else
            return n*factorial_new(n-1);
    }

    public static void main(String[] args) {
        int values=1;
        int result= factorial_new(values);
        System.out.println(result);
    }
}
