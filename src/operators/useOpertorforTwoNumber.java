package operators;

public class useOpertorforTwoNumber {
    public static void main(String[] args) {
        //1.	Use +, -, *, /, % with two numbers.\
        int a= 12;
        int b=10;
        String str = "Numbers Operator Operations";
        //using + operator
        System.out.println(a++);
        System.out.println(++a+b);
        System.out.println(a+b+str);
        System.out.println(str+a+b);
        //using - operator
        System.out.println(a--);
        System.out.println(--b);
        System.out.println(a-b+str);
        System.out.println((str) + (a-b));
        //using * operator
        System.out.println(a*b);
        //using / operation
        System.out.println(a/b);
        //using % operation
        System.out.println(a%b);
    }
}
