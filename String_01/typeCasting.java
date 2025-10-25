import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        // Datatype -> widening  -> narrowing
        //widening casting -> Integer -> int
        //widening -> implicit widening , Expilicit widening
        // 100-90 - a grade 80-89 -b grade 70-79 -c grade
        //60-69 D grade and Below 60 fail
        // If the is greater than 18 person will vote
        // if age is less than 18 person will not vote
        // If age is greater than 75 person will not vote
        // If age is 0 its invalid

        // IF number is divisible by  3 then print fizz
        //If number is divisble by  5 then Print buzz
        //If number is divisible by 3 and 5 both then Print FIZBUZZ

        byte  b=  (byte)128; //Explictly
        int a= b; //Implicit widening
        System.out.println(b);

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = scn.nextInt();

    }
}
