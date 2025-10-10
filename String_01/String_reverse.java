import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(reverse(scn.nextLine()));

    }

    static String reverse(String revstr) {
        String stringvalue = revstr;
        String rev = "";
        for (int i = stringvalue.length() - 1; i >= 0; i--) {
            rev = rev + stringvalue.charAt(i);
        }
        return rev;
    }
}

