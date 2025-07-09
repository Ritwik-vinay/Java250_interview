package JavaWeek1;

public class ADDITION_with_multiple_Paramenter {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.Add();
        addition.Add(15,10);
        addition.Add(15,20,10);
        Addition2 addition2 = new Addition2();
        addition2.Add(10,10);


    }
    static class Addition2 extends Addition{
        void Add() {
            super.Add();
        }
        @Override
        void  Add(int a, int b){
            System.out.println("Addition2 sum with String "+ (a+b));
        }
    }
    static class Addition{
        int a;
        int b;
        void Add(){
            a=5;
            b=5;
            int result1 = a+b;
            System.out.println(result1);
        }
        void Add(int a, int b){
            this.a=a;
            this.b= b;

            int result = a+b;
            System.out.println(result);
        }
        void Add(int a, int b, int c){
            this.a =a;
            this.b= b;
            int result= a+b+c;
            System.out.println(result);
        }

    }
}
