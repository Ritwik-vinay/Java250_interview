package JavaWeek1;

public class classeesandObjects {
    public static void main(String[] args) {
        //Classes are the prototype or logical entity
        //objects are the physical entity
        //creating the instance object of the class
        exampleClass ec = new exampleClass();

        System.out.println(ec.add(23,9));
        System.out.println(ec.add(12,14,12));
    }
    static class  exampleClass{
        //Physical implementation of addition program
        int add(int a , int b){
            int result = a+b;
            return result;
        }
        //method overloading
        int add(int a , int b, int c){
            int result= a+b+c;
            return result;
        }
    }

}
