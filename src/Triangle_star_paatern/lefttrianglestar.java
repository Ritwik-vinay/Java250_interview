package Triangle_star_paatern;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class lefttrianglestar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scn.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
