public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operator
        // + - / * %
        int a= 15;
        int b= 9;
        //a + b -> Concatination
        System.out.println(a+b + " A");
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b );

        //Relational Operator
        //> < <= <= ==!=

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a <= b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //Logical Operator
        // && || !
        boolean abc = true;
        boolean cba = false;

        System.out.println(!abc);
        System.out.println("****************");
        System.out.println(abc && cba);
        System.out.println("********************");
        System.out.println(abc || cba);
    }
}
