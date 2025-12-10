public class StrictMode {
    static void main() {
        final int a =20;
        //a=30; can't be changed as the value is defined as final and it can't be changes
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally i will be executed anyhow");
        }

    }
}
