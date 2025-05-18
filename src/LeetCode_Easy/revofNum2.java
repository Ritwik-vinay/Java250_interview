package LeetCode_Easy;

public class revofNum2 {
    public static void main(String[] args) {
        int num=1234;
        int rev= rev(num);
        System.out.println(rev);
    }

    public static  int rev(int onum){
        int rev=0;
        while (onum!=0){
            int digit= onum%10;
            rev= rev*10+digit;
            onum= onum/10;
        }
        return rev;
    }
}
