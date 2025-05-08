package String2_topic;

public class countrepetativeString {
    public static void main(String[] args) {
        String s ="EveryBody will have the willpower 12311";
        s=s.toLowerCase();
        String seen="";
        for (int i =0;i<=s.length()-1;i++){
            Character ch= s.charAt(i);
            if (seen.indexOf(ch)==-1){
                System.out.println(ch);
                seen+=ch;
            }

        }
    }
}
