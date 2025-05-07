package Triangle_star_paatern;

import java.util.Scanner;

public class rigthangleStar2 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the Lines");
        int n= scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
