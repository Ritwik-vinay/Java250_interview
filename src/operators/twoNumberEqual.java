package operators;

public class twoNumberEqual {
    public static void main(String[] args) {
        //2.Check if two numbers are equal using ==.
        int a= 10;
        int b=12;
        int num= 10;
        String s= "a";
        String n= "b";
        String n2="a";
        System.out.println(a==b);
        System.out.println(a==num);
        //3.Use != to check if values are not equal
        System.out.println(a!=b);
        System.out.println(a!=num);
        //4.Check if a number is greater than another.
        System.out.println(b>a);
        System.out.println(num>b);
        //5. Use logical AND (&&) to check two conditions.
        if (s.matches(n) && n.matches(s)){
            System.out.println("Matching");
        }
        else
        {
            System.out.println("No Matching");
        }
        //6.	Use logical OR (||) to check if either condition is true.
        if (s.matches(n2) || n.matches(s)){
            System.out.println("Matching");
        }
        else
        {
            System.out.println("No Matching");
        }
        //7.	Increment and decrement a number using ++ and --.
        System.out.println(a++);
        System.out.println(++a);


    }
}
