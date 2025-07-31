package JavaWeek2;

public class revInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }
    public static boolean isPalindrome(int x) {
        int original = x;
        int rev=0;
        boolean Palindrome;

    while (x!=0 ){
            int lastdigit= x%10;
            rev= rev*10+lastdigit;
            x=x/10;
        }
        if (original==rev && rev>=0){
            Palindrome=true;
        }
        else {
            Palindrome=false;
        }
        return Palindrome;

    }
}
