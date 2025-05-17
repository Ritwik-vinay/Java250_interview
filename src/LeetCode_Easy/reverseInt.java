package LeetCode_Easy;

public class reverseInt {
    public static void main(String[] args) {
        int value= 987876;

        int rev =  revinteger(value);
        System.out.println(rev);



    }
    public static int revinteger(int x){
        int rev=0;
        while (x!=0){
            int digit = x%10;
            rev = rev*10+digit;
            x=x/10;

        }
        return rev;

    }
}
