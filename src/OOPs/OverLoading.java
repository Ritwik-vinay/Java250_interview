package OOPs;

public class OverLoading {
    public static void main(String[] args) {
        //Overload a method with different parameters.
        sum s= new sum();
        System.out.println(s.sum(3,4));
        System.out.println(s.sum(1,2,3));

    }
    //Method Overloading is the concept of polymorphism
    public static class sum{
        int sum(int a ,int b){
            int result= a+b;
            return result;
        }
        int sum(int a, int b,int c){
            int result= a+b+c;
            return result;
        }
    }
}
