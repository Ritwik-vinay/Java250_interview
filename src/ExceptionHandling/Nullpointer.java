package ExceptionHandling;

public class Nullpointer {
    public static void main(String[] args) {
        //Handle NullPointerException.
        int a=0;
        int b= 2;
        String s=null;
        String s2 = "R";
        try {
            //int result= b/a;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
