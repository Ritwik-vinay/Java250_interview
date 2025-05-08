package String2_topic;

public class consandvowsSentence4 {
    public static void main(String[] args) {
        String sentence="My name is Ritwik Vinay and i am an Engineer";
        int[] result= consvowsSentence(sentence);
        System.out.println("Vowel are "+result[0]);
        System.out.println("Cons are "+ result[1]);

    }

    public static int[] consvowsSentence(String s) {
        int vCount = 0;
        int cCount = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                    vCount++;
                } else
                    cCount++;
            }

        }
        return new int[]{vCount, cCount};
    }
}
