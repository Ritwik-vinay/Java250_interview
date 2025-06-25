package Day1_revision;

import java.util.Scanner;

public class CountOfVowel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String:  ");
        String s = scn.nextLine();
        int Vcount =0;
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                Vcount++;
            }
        }
        System.out.println(Vcount);
    }
}
