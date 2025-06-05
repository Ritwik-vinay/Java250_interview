package DatatTypesAndVariables;

public class VariableAssignment {
    public static void main(String[] args) {
        //Declare a int datatype and assign a value
        int a = 30;
        //2.	Create a double variable and print its value.
        double b= 10.2d;
        //3.	Store your name in a String and print it.
        String name="I am the Luckiest Ritwik";
        String str= "L";
        //4.	Declare a boolean variable and assign true
        boolean nameStatement=true;
        System.out.println(a +" "+ name+ " "+ b +" "+ nameStatement);
        //5.	Perform addition of two integers and store in a third.
        int c=10;
        int d=20;
        int e= c+d;
        double f=a+b;
        System.out.println(e);
        System.out.println(f);
        //6.	Multiply a float and an int, and print result.
        float g= 1.15f;
        System.out.println(c+g);
        //7.	Create a char variable and assign a single letter
        char h= 'a';
        System.out.println(h);
        //8.	Convert an int to a String
        String intToString= String.valueOf(c);
        System.out.println(intToString +" is a String");
        int StringToInt= Integer.parseInt(intToString);
        System.out.println(StringToInt + " is an Integer");
        //10.	Swap two integers using a third variable
        int temp = a;
        a=c;
        c=temp;
        System.out.println(a);
        System.out.println(c);


    }
}
