package LeetCode_Easy;

public class revint2 {
    public static void main(String[] args) {
        int value= 123456;
        int rev= reversedDigit(value);
        System.out.println(rev);
    }

    public static int reversedDigit(int onum){
        int rnum=0;
        while (onum!=0){
            int n= onum%10;
            rnum= rnum*10 +n;
            onum=onum/10;
        }
        return rnum;
    }
}
