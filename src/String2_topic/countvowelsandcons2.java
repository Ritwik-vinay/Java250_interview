package String2_topic;

public class countvowelsandcons2 {
    public static int[] consvows2(String str) {
        int Vcount = 0;
        int Ccount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Vcount++;
            } else if (ch >= 'a' && ch <= 'z') {
                Ccount++;
            }

        }
        return new int[]{Vcount, Ccount};
    }

    public static void main(String[] args) {
        String str = "abhinavchaugole";
        int[] result = consvows2(str);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
