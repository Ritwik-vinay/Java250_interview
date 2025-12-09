import java.util.Scanner;

public class reverseTheString {
    static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String s= scn.next();
       reverseString r=new  reverseString();
       r.reverseString(s);

    }
}
class reverseString{
    void reverseString(String s){
        for (int i =s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
