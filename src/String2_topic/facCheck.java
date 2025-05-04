package String2_topic;

public class facCheck {
    static int factorial(int m) {
        if (m == 1 || m == 0)
            return 1;
        else
            return m * factorial(m - 1);
    }

    public static void main(String[] args) {
        int value= 5;
        int result= factorial(value);
        System.out.println(result);
    }
}
