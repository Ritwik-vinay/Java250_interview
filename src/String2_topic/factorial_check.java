package String2_topic;

public class factorial_check {
    static int facotrial(int n ){
        if (n==0 || n==1)
            return 1;
        else
            return n* facotrial(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        int result=facotrial(num);
        System.out.println(result);
    }
}
