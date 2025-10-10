import java.util.HashSet;
import java.util.Set;

public class PanagramCheck {
    public static void main(String[] args) {
        panaGramChecking("The quick brown fox jumps over the lazy dogs");
    }


    static void panaGramChecking(String str){
        Set<Character> letter = new HashSet<>();
        String sentence= str.toLowerCase();
        for (char ch: sentence.toCharArray()){
            if (ch>='a'&& ch<='z'){
                letter.add(ch);
            }
        }
        if (letter.size()==26){
            System.out.println("Its a panagram");
        }
        else {
            System.out.println("Its Not a panagram!!!");
        }
    }
}
