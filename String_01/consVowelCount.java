public class consVowelCount {
    public static void main(String[] args) {
        //Count vowels and consonants in a String. -Anything, → vowels   consonants
        // Input = String -> "Ritwik"
        //int vcount=0 and int ccount=0
        String s= "Ritwik Vinay";
        consvowCount(s);

    }

    static void consvowCount(String s){
        s = s.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        char ch = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            ch = s.charAt(i);
            // System.out.println(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;


            } else {
                cCount++;
            }
        }
        System.out.println(vCount + " Vowel");
        System.out.println(cCount + " Consonant");


    }
}

