package JavaWeek2;

public class countVowel_And_cons {
    public static void main(String[] args) {
        String  a= "Maantic";
        int vcount=0;
        int ccount =0;
        char ch =0;
        for (int i=0; i<=a.length()-1;i++){
             ch= a.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                System.out.println(ch + " is vowel");
                vcount++;
            }

            else {

                System.out.println(ch + " is cons");
                ccount++;
            }

        }



        System.out.println("Vowel count is " + vcount);
        System.out.println("Consonant count is " + ccount);
    }
}
